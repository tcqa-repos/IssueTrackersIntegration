package CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems

import CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.TfsIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.TfsIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.tfsIssueTracker

object Project : Project({
    uuid = "c00b9012-03d5-48ee-8c8f-9115e6c9bd59"
    extId = "CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "Visual Studio Work Items"

    buildType(CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems_Build)
    buildType(CleanConfigurations_IssueTrackersIntegration_VisualStudioWorkItems_Build1)

    features {
        tfsIssueTracker {
            id = "PROJECT_EXT_10"
            displayName = "VSOnline"
            host = "https://tcqagit.visualstudio.com/DefaultCollection/MyFirstProject"
            userName = "julia.reshetnikova@jetbrains.com"
            password = "zxx65836f7859cb56248b3669234530d05bbba00aaea034b0bbfccc564ea84d4b998d1ff4ef8568ef3635170957f47f08738e8c7ca9e778601d"
            pattern = """#(\d+)"""
            param("key", "visualstudioonline1")
        }
    }
})
