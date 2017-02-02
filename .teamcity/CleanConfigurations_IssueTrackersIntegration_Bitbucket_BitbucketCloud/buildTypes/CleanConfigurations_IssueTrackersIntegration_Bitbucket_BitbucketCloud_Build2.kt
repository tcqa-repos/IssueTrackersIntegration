package CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud_Build2 : BuildType({
    uuid = "c52cb19f-f09d-4d67-a455-05cbdac24621"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud_Build2"
    name = "Build2"

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration_Bitbucket.vcsRoots.CleanConfigurations_IssueTrackersIntegration_Bitbucket_MercurialHttpsJuliaReshBi)

    }
})
