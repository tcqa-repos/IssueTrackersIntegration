package CleanConfigurations_IssueTrackersIntegration.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object CleanConfigurations_IssueTrackersIntegration_CreateCommit : BuildType({
    uuid = "db25949c-ea48-4210-9153-0d1c86f7bc7e"
    extId = "CleanConfigurations_IssueTrackersIntegration_CreateCommit"
    name = "Create commit"


    params {
        text("commit.message", "", display = ParameterDisplay.PROMPT, allowEmpty = false)
        param("file", "File.txt")
        password("my.password", "zxxc60bd5a4f5bd34cb220d9a207b8d406a62c881aae03aa6ef8fcb560c3dbe1138516c0d0ee4d87467775d03cbe80d301b")
        param("my.username", "tcqa-repos")
    }

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            scriptContent = """
                echo {"message":"%commit.message%", "sha": "0d5a690c8fad5e605a6e8766295d9d459d65de42", "content": "YWFhCjExMQoyMjIK\n"} > data.txt
                curl -X PUT -H "Authorization: token 3716d07a9b5cbf3a9b081e2f019ea4ab7600a44c" --data @data.txt https://api.github.com/repos/tcqa-repos/IssueTrackersIntegration/contents/File%build.counter%.txt
            """.trimIndent()
        }
    }
})
