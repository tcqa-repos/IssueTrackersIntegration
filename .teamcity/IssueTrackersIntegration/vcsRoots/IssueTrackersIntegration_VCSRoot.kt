package IssueTrackersIntegration.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object IssueTrackersIntegration_VCSRoot : GitVcsRoot({
    uuid = "IssueTrackersIntegration_VCSRoot"
    extId = "IssueTrackersIntegration_VCSRoot"
    name = "Issue Trackers Integration"
    url = "https://github.com/JuliaResh/IssueTrackersIntegration"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxxb4813732520f9587c2fb27cb30cc3e32"
    }
    param("useAlternates", "")
})
