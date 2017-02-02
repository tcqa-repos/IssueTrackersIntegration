package CleanConfigurations_IssueTrackersIntegration_Jira

import CleanConfigurations_IssueTrackersIntegration_Jira.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.jira

object Project : Project({
    uuid = "8ed169b3-2802-4319-a091-891d53d7eee1"
    extId = "CleanConfigurations_IssueTrackersIntegration_Jira"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "JIRA"
    description = "JTCI"

    buildType(CleanConfigurations_IssueTrackersIntegration_Jira_Build)

    features {
        jira {
            id = "PROJECT_EXT_8"
            displayName = "JIRA"
            host = "http://tcqa-issue-trackers:8080/"
            userName = "admin"
            password = "zxx0feb335798e7f083"
            projectKeys = "JTCI"
            param("key", "jira1")
        }
    }
})
