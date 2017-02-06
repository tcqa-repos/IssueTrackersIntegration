package VisualStudioOnline

import VisualStudioOnline.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.TfsIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.TfsIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.tfsIssueTracker

object Project : Project({
    uuid = "VisualStudioOnline"
    extId = "VisualStudioOnline"
    parentId = "IssueTrackersIntegration"
    name = "Visual Studio Online"

    buildType(VisualStudioOnlineBuild)

    features {
        tfsIssueTracker {
            id = "PROJECT_EXT_1"
            displayName = "Visual Studio Online"
            host = "https://tcqagit.visualstudio.com/DefaultCollection/MyFirstProject"
            userName = "julia.reshetnikova@jetbrains.com"
            password = "zxx65836f7859cb56248b3669234530d05bbba00aaea034b0bbfccc564ea84d4b998d1ff4ef8568ef3635170957f47f08738e8c7ca9e778601d"
            pattern = """#(\d+)"""
            param("key", "visualstudioonline1")
        }
    }
})
