package CleanConfigurations_IssueTrackersIntegration_Bugzilla.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Bugzilla_Build : BuildType({
    uuid = "d8708ab9-b15b-4b6a-bf10-23f094dd7237"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bugzilla_Build"
    name = "Build"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }
})
