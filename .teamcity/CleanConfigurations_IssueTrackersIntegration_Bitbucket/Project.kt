package CleanConfigurations_IssueTrackersIntegration_Bitbucket

import CleanConfigurations_IssueTrackersIntegration_Bitbucket.buildTypes.*
import CleanConfigurations_IssueTrackersIntegration_Bitbucket.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "6ec5304f-be17-4d6e-9127-3129c4d13b90"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "Bitbucket"

    vcsRoot(CleanConfigurations_IssueTrackersIntegration_Bitbucket_MercurialHttpsJuliaReshBi)

    buildType(CleanConfigurations_IssueTrackersIntegration_Bitbucket_Build)

    features {
        feature {
            id = "PROJECT_EXT_3"
            type = "OAuthProvider"
            param("clientId", "za8UbPcuMAEMQrhtm8")
            param("displayName", "Bitbucket Cloud")
            param("providerType", "BitBucketCloud")
            param("secure:clientSecret", "zxx8639f15eb30ea9d5ce081af386d31ade6c39ad8670005e0d057f34b773484a02775d03cbe80d301b")
        }
    }
})
