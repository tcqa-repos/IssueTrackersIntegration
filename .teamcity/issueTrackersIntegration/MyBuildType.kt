package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.BuildType
import jetbrains.buildServer.configs.kotlin.v10.CheckoutMode
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyBuildType(project: Project, name: String = "Build", init: BuildType.() -> Unit = {}) : BuildType({
    this.name = name
    extId = "${project.extId}_$name".toExtId()
    uuid = extId

    vcs {
        root(VcsRoot)
        checkoutMode = CheckoutMode.ON_SERVER
    }
    init()
})
