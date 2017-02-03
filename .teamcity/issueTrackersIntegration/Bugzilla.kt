package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.toExtId


object Bugzilla : Project({
    //name = "Bugzilla"
    uuid = "aaaaaaaaaaaaaaaaaaaaaa"
    extId = name.toExtId()
    parentId = "Issue Trackers Integration Kotlin".toExtId()
})
