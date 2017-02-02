package CleanConfigurations_IssueTrackersIntegration_Redmine.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Redmine_Build : BuildType({
    uuid = "547fd447-8551-4d1c-8aa3-4700fd0742e8"
    extId = "CleanConfigurations_IssueTrackersIntegration_Redmine_Build"
    name = "Build"


    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
