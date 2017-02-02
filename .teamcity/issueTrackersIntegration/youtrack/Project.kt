package issueTrackersIntegration.youtrack

import issueTrackersIntegration.MyProject
import issueTrackersIntegration.youtrack.youtrack523.Project

object Project : MyProject(
        name = "YouTrack",
        parentProject = issueTrackersIntegration.ParentProject,
        init = {
            subProjects(Project)
        }
)
