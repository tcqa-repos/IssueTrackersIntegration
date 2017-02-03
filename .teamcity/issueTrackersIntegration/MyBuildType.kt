package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.BuildType
import jetbrains.buildServer.configs.kotlin.v10.CheckoutMode
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyBuildType(name: String, project: Project, init: BuildType.() -> Unit) : BuildType(init) {
    init {
        extId = "${project.extId}_$name".toExtId()
        uuid = extId

        vcs {
            root(CleanConfigurations_IssueTrackersIntegration.vcsRoots.CleanConfigurations_IssueTrackersIntegration_IssueTrackersIntegration)
            checkoutMode = CheckoutMode.ON_SERVER
        }
    }
}
