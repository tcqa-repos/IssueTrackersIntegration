package Jira.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JiraBuild : BuildType({
    uuid = "JiraBuild"
    extId = "JiraBuild"
    name = "Build"


    vcs {
        root(IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})
