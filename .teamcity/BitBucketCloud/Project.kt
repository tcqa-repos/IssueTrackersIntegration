package BitBucketCloud

import BitBucketCloud.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "BitBucketCloud"
    extId = "BitBucketCloud"
    parentId = "IssueTrackersIntegration"
    name = "BitBucket Cloud"

    buildType(BitBucketCloudBuild)

    features {
        feature {
            id = "PROJECT_EXT_1"
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
        feature {
            id = "PROJECT_EXT_2"
            type = "OAuthProvider"
            param("clientId", "za8UbPcuMAEMQrhtm8")
            param("displayName", "Bitbucket Cloud")
            param("providerType", "BitBucketCloud")
            param("secure:clientSecret", "zxx8639f15eb30ea9d5ce081af386d31ade6c39ad8670005e0d057f34b773484a02775d03cbe80d301b")
        }
    }
})
