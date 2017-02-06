package GitHubCloud

import GitHubCloud.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "GitHubCloud"
    extId = "GitHubCloud"
    parentId = "IssueTrackersIntegration"
    name = "GitHub Cloud"

    buildType(GitHubCloudBuild)

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "IssueTracker"
            param("key", "githubissues1")
            param("name", "GitHub")
            param("pattern", """#(\d+)""")
            param("repository", "JuliaResh/IssueTrackersIntegration")
            param("secure:password", "zxx775d03cbe80d301b")
            param("type", "GithubIssues")
            param("username", "")
        }
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
