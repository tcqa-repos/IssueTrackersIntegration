package IssueTrackersIntegration

import IssueTrackersIntegration.buildTypes.*
import IssueTrackersIntegration.vcsRoots.*
import IssueTrackersIntegration.vcsRoots.IssueTrackersIntegration_VCSRoot
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "IssueTrackersIntegration"
    extId = "IssueTrackersIntegration"
    parentId = "_Root"
    name = "Issue Trackers Integration"

    vcsRoot(IssueTrackersIntegration_VCSRoot)

    buildType(IssueTrackersIntegrationCreateCommit)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = IssueTrackersIntegration_VCSRoot.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
