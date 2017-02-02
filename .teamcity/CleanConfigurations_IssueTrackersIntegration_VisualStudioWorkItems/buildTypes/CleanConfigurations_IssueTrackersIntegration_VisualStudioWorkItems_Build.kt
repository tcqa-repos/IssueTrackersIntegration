package CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems_Build : BuildType({
    uuid = "5dcb2ff4-48f1-452d-8820-2f967d8a4adb"
    extId = "CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems_Build"
    name = "Build"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }
})
