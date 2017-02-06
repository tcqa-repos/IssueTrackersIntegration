package IssueTrackersIntegration.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object IssueTrackersIntegrationCreateCommit : BuildType({
    uuid = "IssueTrackersIntegrationCreateCommit"
    extId = "IssueTrackersIntegrationCreateCommit"
    name = "Create commit"


    params {
        text("commit.message", "", display = ParameterDisplay.PROMPT, allowEmpty = false)
        param("file", "File.txt")
        param("my.username", "tcqa-repos")
        password("token", "zxx5010971781b88bf9ab4a6e46caf02cd31f5b3ad0110880a606d14a628d4d76a72665f8253d16f0c4775d03cbe80d301b")
    }

    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            scriptContent = """
                echo {"message":"%commit.message%", "sha": "0d5a690c8fad5e605a6e8766295d9d459d65de42", "content": "YWFhCjExMQoyMjIK\n"} > data.txt
                curl -X PUT -H "Authorization: token %token%" --data @data.txt https://api.github.com/repos/tcqa-repos/IssueTrackersIntegration/contents/File%build.counter%.txt
            """.trimIndent()
        }
    }
})
