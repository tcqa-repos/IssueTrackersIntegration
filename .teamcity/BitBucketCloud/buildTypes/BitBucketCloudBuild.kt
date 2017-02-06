package BitBucketCloud.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BitBucketCloudBuild : BuildType({
    uuid = "BitBucketCloudBuild"
    extId = "BitBucketCloudBuild"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
