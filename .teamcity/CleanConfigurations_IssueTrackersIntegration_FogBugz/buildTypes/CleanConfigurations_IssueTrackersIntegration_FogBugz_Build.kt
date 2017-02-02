package CleanConfigurations_IssueTrackersIntegration_FogBugz.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_FogBugz_Build : BuildType({
    uuid = "68d2bbf8-445e-481b-861f-45d4e30888bc"
    extId = "CleanConfigurations_IssueTrackersIntegration_FogBugz_Build"
    name = "Build"


    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
