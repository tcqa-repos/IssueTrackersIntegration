package CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud_Build : BuildType({
    uuid = "608d7059-8d77-42de-9a60-b45f1f791b3c"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud_Build"
    name = "Build"

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

    }
})
