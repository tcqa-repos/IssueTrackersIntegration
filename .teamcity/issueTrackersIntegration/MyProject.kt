package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyProject(projectName: String, init: Project.() -> Unit = {} ) : Project({
    name = projectName
    extId = name.toExtId()
    uuid = extId
    init()
}, null)
