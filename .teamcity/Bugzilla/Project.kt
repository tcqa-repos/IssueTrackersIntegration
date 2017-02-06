package Bugzilla

import Bugzilla.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.BugzillaIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.BugzillaIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.bugzilla

object Project : Project({
    uuid = "Bugzilla"
    extId = "Bugzilla"
    parentId = "IssueTrackersIntegration"
    name = "Bugzilla"

    buildType(BugzillaBuild)

    features {
        bugzilla {
            id = "PROJECT_EXT_1"
            displayName = "Bugzilla 3.4"
            host = "http://tcqa-issue-trackers:80/"
            userName = ""
            password = "zxx775d03cbe80d301b"
            issueIdPattern = """#(\d+)"""
            param("key", "bugzilla1")
        }
    }
})
