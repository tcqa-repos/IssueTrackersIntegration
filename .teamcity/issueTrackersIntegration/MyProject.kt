package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyProject(name: String, init: Project.() -> Unit) : Project(init) {
    init {
        super.name = name
        extId = name.toExtId()
        uuid = extId
    }
}
