package issueTrackersIntegration

object ParentProject : MyProject (
        name = "Issue Trackers Integration Kotlin",
        init = {
            parentId = "CleanConfigurations_IssueTrackersIntegration"
            subProjects(issueTrackersIntegration.YouTrackProject)
            subProjects(Bugzilla)
        }
)
