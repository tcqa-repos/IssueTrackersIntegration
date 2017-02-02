package issueTrackersIntegration.bugzilla


import issueTrackersIntegration.MyProject

object ParentProject : MyProject(
        name = "BugZilla",
        init = {
            subProjects()
        }
)
