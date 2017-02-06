package Jira

import Jira.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.jira

object Project : Project({
    uuid = "Jira"
    extId = "Jira"
    parentId = "IssueTrackersIntegration"
    name = "Jira"

    buildType(JiraBuild)

    features {
        jira {
            id = "PROJECT_EXT_1"
            displayName = "JIRA"
            host = "http://tcqa-jira.labs.intellij.net:8080"
            userName = "jetbrains"
            password = "zxx40e55c340cc60870afe724486117c369"
            projectKeys = "DEV SP TEST"
        }
    }
})
