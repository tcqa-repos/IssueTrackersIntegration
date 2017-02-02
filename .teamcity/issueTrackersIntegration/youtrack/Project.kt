package issueTrackersIntegration.youtrack

import issueTrackersIntegration.MyProject

object Project : MyProject(
        name = "YouTrack",
        init = {
            subProjects(issueTrackersIntegration.youtrack.youtrack523.Project)
        }
)
