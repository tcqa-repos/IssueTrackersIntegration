package CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer_Build : BuildType({
    uuid = "4282c10e-3c8f-44d5-9ffa-ea7ad66f51aa"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer_Build"
    name = "Build"

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration_Bitbucket.vcsRoots.CleanConfigurations_IssueTrackersIntegration_Bitbucket_MercurialHttpsJuliaReshBi)

    }
})
