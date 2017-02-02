package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyProject(name: String, parentProjectId: String, init: Project.() -> Unit) : Project(init) {
    init {
        extId = "${parentProjectId}_$name".toExtId()
        uuid = extId
        parentId = parentProjectId
    }
}
