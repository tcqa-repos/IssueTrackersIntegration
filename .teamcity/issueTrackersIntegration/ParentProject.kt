package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeatures
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings
import jetbrains.buildServer.configs.kotlin.v10.toExtId

object ParentProject : MyProject ("Issue Trackers Integration", {
    parentId = "_Root"

    vcsRoot(VcsRoot)

    val projects = mapOf<String, ProjectFeatures>(
            Pair("YouTrack 6.0", ProjectFeatures(listOf(YouTrack_6_0))),
            Pair("Jira", ProjectFeatures(listOf(Jira))),
            Pair("Bugzilla", ProjectFeatures(listOf(Bugzilla_3_4))),
            Pair("Fogbugz", ProjectFeatures(listOf(FogBugz))),
            Pair("Visual Studio Online", ProjectFeatures(listOf(VisualStudioOnline))),
            Pair("GitHub Cloud", ProjectFeatures(listOf(GithubCloud, GithubOAuth))),
            Pair("BitBucket Cloud", ProjectFeatures(listOf(BitbucketCloud, BitbucketCloudOAuth)))
    ).map {
        MyProject( it.key, {
            parentId = "Issue Trackers Integration Kotlin".toExtId()
            buildType(MyBuildType(this))
            features(it.value)
        })
    }

    projects.forEach { subProject(it) }

    features {
        versionedSettings {
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = VcsRoot.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }

    buildType(MyBuildType(this, "Create commit", {
        params {
            text("commit.message", "", display = ParameterDisplay.PROMPT, allowEmpty = false)
            param("file", "File.txt")
            password("token", "zxx5010971781b88bf9ab4a6e46caf02cd31f5b3ad0110880a606d14a628d4d76a72665f8253d16f0c4775d03cbe80d301b")
            param("my.username", "tcqa-repos")
        }

        steps {
            script {
                scriptContent = """
                echo {"message":"%commit.message%", "sha": "0d5a690c8fad5e605a6e8766295d9d459d65de42", "content": "YWFhCjExMQoyMjIK\n"} > data.txt
                curl -X PUT -H "Authorization: token %token%" --data @data.txt https://api.github.com/repos/tcqa-repos/IssueTrackersIntegration/contents/File%build.counter%.txt
            """.trimIndent()
            }
        }
    }))
})
