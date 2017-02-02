package CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer

import CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "56acb0c7-e590-4915-80ea-c1b9fc20ce91"
    extId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer"
    parentId = "CleanConfigurations_IssueTrackersIntegration_Bitbucket"
    name = "Bitbucket Server"

    buildType(CleanConfigurations_IssueTrackersIntegration_Bitbucket_BitbucketServer_Build)
})
