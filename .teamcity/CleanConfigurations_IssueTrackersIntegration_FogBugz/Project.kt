package CleanConfigurations_IssueTrackersIntegration_FogBugz

import CleanConfigurations_IssueTrackersIntegration_FogBugz.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "f374bd99-2c7b-4e3a-b7c7-86a118d8cd39"
    extId = "CleanConfigurations_IssueTrackersIntegration_FogBugz"
    parentId = "CleanConfigurations_IssueTrackersIntegration"
    name = "FogBugz"
    description = "FogBugz on demand"

    buildType(CleanConfigurations_IssueTrackersIntegration_FogBugz_Build)

    features {
        feature {
            id = "PROJECT_EXT_7"
            type = "IssueTracker"
            param("host", "https://tcqa.fogbugz.com/")
            param("key", "fogbugz1")
            param("name", "FogBugz")
            param("pattern", """(\d+)""")
            param("secure:password", "zxx51258c7e47dac515ab5f7ea7ddba4ab2")
            param("type", "fogbugz")
            param("username", "tcqa.user1@gmail.com")
        }
    }
})
