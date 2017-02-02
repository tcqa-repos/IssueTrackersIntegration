package CleanConfigurations_IssueTrackersIntegration_Bugzilla

import CleanConfigurations_IssueTrackersIntegration_Bugzilla.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.BugzillaIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.BugzillaIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.bugzilla

object Project : Project({
    uuid = "b26300ef-f306-487a-adc3-4ae6a2dac2bb"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bugzilla"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "Bugzilla"

    buildType(CleanConfigurations_IssueTrackersIntegration_Bugzilla_Build)

    features {
        bugzilla {
            id = "PROJECT_EXT_6"
            displayName = "Bugzilla 3.4"
            host = "http://tcqa-issue-trackers:80/"
            userName = ""
            password = "zxx775d03cbe80d301b"
            issueIdPattern = """#(\d+)"""
            param("key", "bugzilla1")
        }
    }
})
