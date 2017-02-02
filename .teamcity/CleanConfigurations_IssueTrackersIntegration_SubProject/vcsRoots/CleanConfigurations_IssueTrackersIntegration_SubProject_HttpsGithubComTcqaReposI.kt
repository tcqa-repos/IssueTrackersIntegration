package CleanConfigurations_IssueTrackersIntegration_SubProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object CleanConfigurations_IssueTrackersIntegration_SubProject_HttpsGithubComTcqaReposI : GitVcsRoot({
    uuid = "121bc748-4a08-491d-a1ba-c0d706478f06"
    extId = "CleanConfigurations_IssueTrackersIntegration_SubProject_HttpsGithubComTcqaReposI"
    name = "https://github.com/tcqa-repos/IssueTrackersIntegration#refs/heads/master"
    url = "https://github.com/tcqa-repos/IssueTrackersIntegration"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx44a57e525ebe993ddb650631c2e4b4c0f20e75f6786d6e98a5b1cfe6a01fbabcde1ff89b60ff5717775d03cbe80d301b"
    }
})
