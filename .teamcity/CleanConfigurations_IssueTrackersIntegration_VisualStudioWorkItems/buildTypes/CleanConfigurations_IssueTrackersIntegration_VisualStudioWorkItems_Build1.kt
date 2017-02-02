package CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems_Build1 : BuildType({
    uuid = "a228cd45-10a6-4563-a1d2-3f672232c2e1"
    extId = "CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems_Build1"
    name = "Build (1)"


    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
