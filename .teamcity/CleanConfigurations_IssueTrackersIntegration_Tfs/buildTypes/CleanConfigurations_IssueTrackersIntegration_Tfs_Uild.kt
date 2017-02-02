package CleanConfigurations_IssueTrackersIntegration_Tfs.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object CleanConfigurations_IssueTrackersIntegration_Tfs_Uild : BuildType({
    uuid = "47427522-11bc-4d33-b31c-b9dfbbc01372"
    extId = "CleanConfigurations_IssueTrackersIntegration_Tfs_Uild"
    name = "Build"

    artifactRules = "**/* =>"

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration_Tfs.vcsRoots.CleanConfigurations_IssueTrackersIntegration_Tfs_Vsts)

    }
})
