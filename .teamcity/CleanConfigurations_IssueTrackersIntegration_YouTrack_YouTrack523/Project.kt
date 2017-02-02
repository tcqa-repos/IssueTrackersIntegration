package CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523

import CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object Project : Project({
    uuid = "e4f5d492-b7eb-4eeb-a23b-7deecec622c1"
    extId = "CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523"
    parentId = "CleanConfigurations_IssueTrackersIntegration_YouTrack"
    name = "YouTrack 5.2.3"

    buildType(CleanConfigurations_IssueTrackersIntegration_YouTrack_YouTrack523_Build)

    features {
        youtrack {
            id = "PROJECT_EXT_11"
            displayName = "YT 6.0"
            host = "http://tcqa-youtrack-6"
            userName = "root"
            password = "zxx0feb335798e7f083"
            projectExtIds = "PR"
            useAutomaticIds = true
            param("key", "youtrack2")
        }
    }
})
