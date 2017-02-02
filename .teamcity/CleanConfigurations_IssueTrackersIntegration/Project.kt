package CleanConfigurations_IssueTrackersIntegration

import CleanConfigurations_IssueTrackersIntegration.buildTypes.*
import CleanConfigurations_IssueTrackersIntegration.vcsRoots.*
import CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object Project : Project({
    uuid = "7c09303a-9cae-4e1f-b5c6-dd4ccb113b17"
    extId = "CleanConfigurations_IssueTrackersIntegration"
    parentId = "_Root"
    name = "Issue Trackers Integration"

    vcsRoot(CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)

    buildType(CleanConfigurations_IssueTrackersIntegration_CreateCommit)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
        youtrack {
            id = "PROJECT_EXT_4"
            displayName = "YT 6"
            host = "http://tcqa-youtrack-6"
            userName = "root"
            password = "zxx0feb335798e7f083"
            projectExtIds = "PR"
            useAutomaticIds = true
            param("key", "youtrack1")
        }
    }
})
