package CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523_Build : BuildType({
    uuid = "f2729e7b-fa33-484c-ab3e-f7b0fc3d14a5"
    extId = "CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523_Build"
    name = "Build"


    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
