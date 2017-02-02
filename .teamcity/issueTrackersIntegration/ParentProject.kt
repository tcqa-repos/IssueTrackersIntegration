package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.jira
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object ParentProject : MyProject (

        name = "Issue Trackers Integration Kotlin",
        init = {

            parentId = "CleanConfigurations_IssueTrackersIntegration"

            val trackers = arrayOf(
                    features {
                        youtrack {
                            displayName = "YT 6"
                            host = "http://tcqa-youtrack-6"
                            userName = "root"
                            password = "zxx0feb335798e7f083"
                            projectExtIds = "PR"
                            useAutomaticIds = true
                            param("key", "youtrack1") }
                    },
                    features {
                        jira {
                            displayName = "JIRA"
                            host = "http://tcqa-issue-trackers:8080/"
                            userName = "admin"
                            password = "zxx0feb335798e7f083"
                            projectKeys = "JTCI"
                            param("key", "jira1")
                        }
                    }
            )

            subProjects(issueTrackersIntegration.YouTrackProject)
            subProjects(Bugzilla)
            subProject { MyProject(name = "Redmine", init = {}) }
//            trackers.forEach {
//                subProject { MyProject(it.toString(), init = {it}) }
//            }
        }
)
