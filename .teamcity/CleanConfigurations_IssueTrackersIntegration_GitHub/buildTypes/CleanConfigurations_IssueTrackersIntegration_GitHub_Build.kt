package CleanConfigurations_IssueTrackersIntegration_GitHub.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_GitHub_Build : BuildType({
    uuid = "9a962207-5ca6-410c-af70-f10bdbb5b26a"
    extId = "CleanConfigurations_IssueTrackersIntegration_GitHub_Build"
    name = "Build"


    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
