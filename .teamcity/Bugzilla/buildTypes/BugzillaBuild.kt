package Bugzilla.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BugzillaBuild : BuildType({
    uuid = "BugzillaBuild"
    extId = "BugzillaBuild"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
