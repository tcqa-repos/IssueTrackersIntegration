package issueTrackersIntegration.bugzilla


import issueTrackersIntegration.MyProject

object ParentProject : MyProject(
        name = "BugZilla",
        parentProjectId = issueTrackersIntegration.ParentProject.extId,
        init = {
            subProjects()
        }
)
