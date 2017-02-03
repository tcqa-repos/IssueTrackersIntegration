package IssueTrackersIntegration

object YouTrackProject : MyProject(
        projectName = "YouTrack",
        init = {
            subProjects(YouTrack523Project)
        }
)
