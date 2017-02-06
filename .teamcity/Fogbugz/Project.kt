package Fogbugz

import Fogbugz.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "Fogbugz"
    extId = "Fogbugz"
    parentId = "IssueTrackersIntegration"
    name = "Fogbugz"

    buildType(FogbugzBuild)

    features {
        feature {
            id = "PROJECT_EXT_1"
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
