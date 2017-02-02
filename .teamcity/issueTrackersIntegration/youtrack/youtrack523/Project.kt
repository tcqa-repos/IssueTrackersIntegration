package issueTrackersIntegration.youtrack.youtrack523

import issueTrackersIntegration.MyProject
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object Project : MyProject(
        name = "YouTrack 5.2.3",
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
        }
)
