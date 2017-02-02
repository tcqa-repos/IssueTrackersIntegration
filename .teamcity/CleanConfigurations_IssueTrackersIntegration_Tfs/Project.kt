package CleanConfigurations_IssueTrackersIntegration_Tfs

import CleanConfigurations_IssueTrackersIntegration_Tfs.buildTypes.*
import CleanConfigurations_IssueTrackersIntegration_Tfs.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "76670523-15b2-483e-8cb5-8fe6d6f9c3c9"
    extId = "CleanConfigurations_IssueTrackersIntegration_Tfs"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "TFS"

    vcsRoot(CleanConfigurations_IssueTrackersIntegration_Tfs_Vsts)

    buildType(CleanConfigurations_IssueTrackersIntegration_Tfs_Uild)
})
