package CleanConfigurations_IssueTrackersIntegration_Bitbucket.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Bitbucket_Build : BuildType({
    uuid = "3696d1ca-2ace-4d1b-aa47-0a39a1a56e3c"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket_Build"
    name = "Build"

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration_Bitbucket.vcsRoots.CleanConfigurations_IssueTrackersIntegration_Bitbucket_MercurialHttpsJuliaReshBi)

    }
})
