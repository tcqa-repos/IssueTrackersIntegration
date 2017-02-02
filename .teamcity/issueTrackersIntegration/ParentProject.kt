package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project

object ParentProject : Project({
    extId = "IssueTrackersIntegration"
    uuid = extId
    name = "Issue Trackers Integration Kotlin"
    parentId = "CleanConfigurations_IssueTrackersIntegration"

    subProjects(issueTrackersIntegration.youtrack.Project)
    subProjects(issueTrackersIntegration.bugzilla.ParentProject)
})
