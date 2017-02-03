package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeatures
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.toExtId
import org.jetbrains.kotlin.utils.addToStdlib.singletonList

object ParentProject : MyProject (

        projectName = "Issue Trackers Integration Kotlin",
        init = {
            parentId = "CleanConfigurations_IssueTrackersIntegration"

            val projects = arrayOf(
                    ProjectFeatures(
                            YouTrackIssueTracker ({
                                displayName = "YT 6"
                                host = "http://tcqa-youtrack-6"
                                userName = "root"
                                password = "zxx0feb335798e7f083"
                                projectExtIds = "PR"
                                useAutomaticIds = true
                                param("key", "youtrack1")
                            }).singletonList()
                    ),
                    ProjectFeatures(
                            JiraIssueTracker ({
                                displayName = "JIRA"
                                host = "http://tcqa-issue-trackers:8080/"
                                userName = "admin"
                                password = "zxx0feb335798e7f083"
                                projectKeys = "JTCI"
                                param("key", "jira1")
                            }).singletonList()
                    )
            ).map {object : MyProject( "Test Project Name ${it.hashCode()}", {
                        parentId = "Issue Trackers Integration Kotlin".toExtId()
                        features(it)
                    }) {}
            }


            //subProjects(issueTrackersIntegration.YouTrackProject)
//            subProjects(Bugzilla)
//            subProjects (
//                    object : Project({
//                        name = "My Project"
//                        uuid = "some-uuid"
//                        extId = name.toExtId()
//                    }) {}
//            )

            subProject (
                    Project({
                        name = "My Project 2"
                        uuid = "some-uuidD"
                        extId = name.toExtId()
                    })
            )
            subProjects (Bugzilla)


//            projects.forEach { subProjects (it) }

//            trackers.forEach {
//                subProject { MyProject(it.toString(), init = {it}) }
//            }
        }
)
