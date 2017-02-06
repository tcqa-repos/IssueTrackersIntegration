package YouTrack60

import YouTrack60.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object Project : Project({
    uuid = "YouTrack60"
    extId = "YouTrack60"
    parentId = "IssueTrackersIntegration"
    name = "YouTrack 6.0"

    buildType(YouTrack60Build)

    features {
        youtrack {
            id = "PROJECT_EXT_1"
            displayName = "YoutTrack 6.0"
            host = "http://tcqa-youtrack-6"
            userName = "root"
            password = "zxx0feb335798e7f083"
            projectExtIds = "PR"
            useAutomaticIds = true
            param("key", "youtrack1")
        }
    }
})
