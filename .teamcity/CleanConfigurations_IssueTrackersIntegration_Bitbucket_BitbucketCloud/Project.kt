package CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud

import CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "0a3fdbd7-c43a-467f-9fd7-c40c8a1edc23"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud"
    parentId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket"
    name = "Bitbucket Cloud"

    buildType(CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud_Build)
    buildType(CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketCloud_Build2)

    features {
        feature {
            id = "PROJECT_EXT_5"
            type = "IssueTracker"
            param("authType", "anonymous")
            param("host", "https://bitbucket.org/JuliaResh/myproject/")
            param("key", "BitBucketIssues1")
            param("name", "Bitbucket Cloud")
            param("pattern", """#(\d+)""")
            param("repository", "https://bitbucket.org/JuliaResh/myproject")
            param("secure:password", "zxx775d03cbe80d301b")
            param("type", "BitBucketIssues")
            param("username", "")
        }
    }
})
