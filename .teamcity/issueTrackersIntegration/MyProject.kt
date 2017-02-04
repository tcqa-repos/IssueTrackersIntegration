package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyProject(name: String, init: Project.() -> Unit = {} ) : Project({
    this.name = name
    extId = name.toExtId()
    uuid = extId

    init()
})
