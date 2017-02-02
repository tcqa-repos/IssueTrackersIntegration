package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId

open class MyProject(name: String, parentProject: Project, init: Project.() -> Unit) : Project(init) {
    init {
        extId = "${parentProject.extId}_$name".toExtId()
        uuid = extId
        parentId = parentProject.extId
    }
}
