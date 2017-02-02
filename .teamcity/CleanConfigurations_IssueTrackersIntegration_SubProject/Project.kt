package CleanConfigurations_IssueTrackersIntegration_SubProject

import CleanConfigurations_IssueTrackersIntegration_SubProject.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "f29e00b1-d093-4a5d-a4ff-968c67d8b45c"
    extId = "CleanConfigurations_IssueTrackersIntegration_SubProject"
    parentId = "CleanConfigurations_IssueTrackersIntegration_GitHub"
    name = "SubProject"

    vcsRoot(CleanConfigurations_IssueTrackersIntegration_SubProject_HttpsGithubComTcqaReposI)
})
