package issueTrackersIntegration.bugzilla


import issueTrackersIntegration.MyProject

object ParentProject : MyProject(
        name = "BugZilla",
        parentProject = issueTrackersIntegration.ParentProject,
        init = {
            subProjects()
        }
)
