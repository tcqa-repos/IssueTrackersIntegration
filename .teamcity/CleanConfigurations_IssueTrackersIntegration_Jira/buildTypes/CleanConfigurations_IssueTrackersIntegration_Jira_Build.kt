package CleanConfigurations_IssueTrackersIntegration_Jira.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Jira_Build : BuildType({
    uuid = "382c3b60-88d5-48af-a24e-71896c1ad57f"
    extId = "CleanConfigurations_IssueTrackersIntegration_Jira_Build"
    name = "Build"


    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
