package issueTrackersIntegration.youtrack

import issueTrackersIntegration.MyProject
import issueTrackersIntegration.youtrack.youtrack523.Project

object Project : MyProject(
        name = "YouTrack",
        parentProjectId = issueTrackersIntegration.ParentProject.extId,
        init = {
            subProjects(Project)
        }
)
