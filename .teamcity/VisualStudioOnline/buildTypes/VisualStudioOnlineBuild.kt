package VisualStudioOnline.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object VisualStudioOnlineBuild : BuildType({
    uuid = "VisualStudioOnlineBuild"
    extId = "VisualStudioOnlineBuild"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
