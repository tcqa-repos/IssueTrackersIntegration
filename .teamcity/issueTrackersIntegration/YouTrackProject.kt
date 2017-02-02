package issueTrackersIntegration

object YouTrackProject : MyProject(
        name = "YouTrack",
        init = {
            subProjects(YouTrack523Project)
        }
)
