package IssueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object YouTrack523Project : MyProject(
        projectName = "YouTrack 5.2.3",
        init = {
            features {
                youtrack {
                    id = "PROJECT_EXT_11"
                    displayName = "YT 6.0"
                    host = "http://tcqa-youtrack-6"
                    userName = "root"
                    password = "zxx0feb335798e7f083"
                    projectExtIds = "PR"
                    useAutomaticIds = true
                    param("key", "youtrack2")
                }
            }

            buildType(MyBuildType(name = "Build", project = this, init = {}))
        }
)
