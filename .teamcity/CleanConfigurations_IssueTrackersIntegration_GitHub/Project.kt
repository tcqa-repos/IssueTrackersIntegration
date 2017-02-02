package CleanConfigurations_IssueTrackersIntegration_GitHub

import CleanConfigurations_IssueTrackersIntegration_GitHub.buildTypes.*
import CleanConfigurations_IssueTrackersIntegration_GitHub.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "87c80a8d-eab6-44c2-a87b-81bf2a3d8ead"
    extId = "CleanConfigurations_IssueTrackersIntegration_GitHub"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "GitHub"

    vcsRoot(CleanConfigurations_IssueTrackersIntegration_GitHub_HttpsGithubComMilgnerTeamCit)

    buildType(CleanConfigurations_IssueTrackersIntegration_GitHub_BuildPlugin)
    buildType(CleanConfigurations_IssueTrackersIntegration_GitHub_Build)

    features {
        feature {
            id = "PROJECT_EXT_2"
            type = "OAuthProvider"
            param("clientId", "e0090de015ed2bcc3c8e")
            param("displayName", "GitHub.com")
            param("gitHubUrl", "https://github.com/")
            param("providerType", "GitHub")
            param("secure:clientSecret", "zxxc28c7cb30369035c5a9015f85149b54ae51678e0d8c9a83a1c022bf98dd771685c416f4bdc1e8c6b775d03cbe80d301b")
        }
    }
})
