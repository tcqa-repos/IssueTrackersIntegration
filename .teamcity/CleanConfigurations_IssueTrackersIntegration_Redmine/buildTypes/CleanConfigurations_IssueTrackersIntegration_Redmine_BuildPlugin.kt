package CleanConfigurations_IssueTrackersIntegration_Redmine.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven

object CleanConfigurations_IssueTrackersIntegration_Redmine_BuildPlugin : BuildType({
    uuid = "97b1fbbe-4174-4032-85c0-bb23b5713641"
    extId = "CleanConfigurations_IssueTrackersIntegration_Redmine_BuildPlugin"
    name = "Build plugin"
    description = "https://github.com/milgner/TeamCityRedmine"

    artifactRules = """target\redmine.zip"""

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration_Redmine.vcsRoots.CleanConfigurations_IssueTrackersIntegration_Redmine_HttpsGithubComMilgnerTeamCi)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        maven {
            goals = "clean test package"
            userSettingsPath = ""
            param("maven.path", "%teamcity.tool.maven.AUTO%")
        }
    }
})
