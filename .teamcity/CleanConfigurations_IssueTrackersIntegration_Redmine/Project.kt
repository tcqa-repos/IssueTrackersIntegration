package CleanConfigurations_IssueTrackersIntegration_Redmine

import CleanConfigurations_IssueTrackersIntegration_Redmine.buildTypes.*
import CleanConfigurations_IssueTrackersIntegration_Redmine.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "c28b77b1-364d-4c6d-941e-8f50b87de36f"
    extId = "CleanConfigurations_IssueTrackersIntegration_Redmine"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "Redmine"
    description = "2.5.2"

    vcsRoot(CleanConfigurations_IssueTrackersIntegration_Redmine_HttpsGithubComMilgnerTeamCi)

    buildType(CleanConfigurations_IssueTrackersIntegration_Redmine_BuildPlugin)
    buildType(CleanConfigurations_IssueTrackersIntegration_Redmine_Build)

    features {
        feature {
            id = "PROJECT_EXT_9"
            type = "IssueTracker"
            param("key", "githubissues1")
            param("name", "GitHub")
            param("pattern", """#(\d+)""")
            param("repository", "JuliaResh/IssueTrackersIntegration")
            param("secure:password", "zxx775d03cbe80d301b")
            param("type", "GithubIssues")
            param("username", "")
        }
    }
})
