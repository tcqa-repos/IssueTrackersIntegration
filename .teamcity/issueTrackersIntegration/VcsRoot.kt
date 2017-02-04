package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object VcsRoot : GitVcsRoot({
    name = "Issue Trackers Integration"
    extId = "IssueTrackersIntegration_VCSRoot"
    uuid = extId
    url = "https://github.com/JuliaResh/IssueTrackersIntegration"
    useMirrors = false
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxxb4813732520f9587c2fb27cb30cc3e32"
    }
})
