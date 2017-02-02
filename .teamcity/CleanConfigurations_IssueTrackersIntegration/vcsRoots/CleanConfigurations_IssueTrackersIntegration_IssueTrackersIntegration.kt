package CleanConfigurations_IssueTrackersIntegration.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration : GitVcsRoot({
    uuid = "5f9fe6e5-8e3b-450a-a878-eb1f9eab7175"
    extId = "CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration"
    name = "Issue Trackers Integration"
    url = "https://github.com/JuliaResh/IssueTrackersIntegration"
    useMirrors = false
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxxb4813732520f9587c2fb27cb30cc3e32"
    }
})
