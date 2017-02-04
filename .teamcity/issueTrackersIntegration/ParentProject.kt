package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.ParameterDisplay
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeatures
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings
import jetbrains.buildServer.configs.kotlin.v10.toExtId

object ParentProject : MyProject ("Issue Trackers Integration Kotlin", {
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
            password("my.password", "zxxc60bd5a4f5bd34cb220d9a207b8d406a62c881aae03aa6ef8fcb560c3dbe1138516c0d0ee4d87467775d03cbe80d301b")
            param("my.username", "tcqa-repos")
        }

        steps {
            script {
                scriptContent = """
                echo {"message":"%commit.message%", "sha": "0d5a690c8fad5e605a6e8766295d9d459d65de42", "content": "YWFhCjExMQoyMjIK\n"} > data.txt
                curl -X PUT -H "Authorization: token 3716d07a9b5cbf3a9b081e2f019ea4ab7600a44c" --data @data.txt https://api.github.com/repos/tcqa-repos/IssueTrackersIntegration/contents/File%build.counter%.txt
            """.trimIndent()
            }
        }
    }))
})
