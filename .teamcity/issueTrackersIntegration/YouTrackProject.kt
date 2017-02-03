package issueTrackersIntegration

object YouTrackProject : MyProject(
        projectName = "YouTrack",
        init = {
            subProjects(YouTrack523Project)
        }
)
