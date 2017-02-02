package CleanConfigurations_IssueTrackersIntegration_GitHub.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven

object CleanConfigurations_IssueTrackersIntegration_GitHub_BuildPlugin : BuildType({
    uuid = "005e3430-813f-4af6-a084-0f2b68fd6b3f"
    extId = "CleanConfigurations_IssueTrackersIntegration_GitHub_BuildPlugin"
    name = "Build plugin"
    description = "https://github.com/milgner/TeamCityGithub/"

    artifactRules = """target\githubissues.zip"""

    vcs {
        root(CleanConfigurations_IssueTrackersIntegration_GitHub.vcsRoots.CleanConfigurations_IssueTrackersIntegration_GitHub_HttpsGithubComMilgnerTeamCit)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        maven {
            goals = "clean test package"
            userSettingsPath = ""
            param("maven.path", "%teamcity.tool.maven.AUTO%")
            param("target.jdk.home", "%env.JDK_17%")
        }
    }
})
