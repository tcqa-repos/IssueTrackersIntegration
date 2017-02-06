package GitHubCloud.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object GitHubCloudBuild : BuildType({
    uuid = "GitHubCloudBuild"
    extId = "GitHubCloudBuild"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
