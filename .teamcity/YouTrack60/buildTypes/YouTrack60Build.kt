package YouTrack60.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object YouTrack60Build : BuildType({
    uuid = "YouTrack60Build"
    extId = "YouTrack60Build"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
