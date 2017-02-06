package Fogbugz.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object FogbugzBuild : BuildType({
    uuid = "FogbugzBuild"
    extId = "FogbugzBuild"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
