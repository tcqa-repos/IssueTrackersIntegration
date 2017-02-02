package CleanConfigurations_IssueTrackersIntegration_Tfs.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.TfsVcsRoot

object CleanConfigurations_IssueTrackersIntegration_Tfs_Vsts : TfsVcsRoot({
    uuid = "a96b4096-e547-4193-9f04-fc0a295a9798"
    extId = "CleanConfigurations_IssueTrackersIntegration_Tfs_Vsts"
    name = "VSTS"
    url = "https://tcqagit.visualstudio.com/DefaultCollection"
    root = "${'$'}/MyFirstProject"
    userName = "julia.reshetnikova@jetbrains.com"
    password = "zxx65836f7859cb56248b3669234530d05bbba00aaea034b0bbfccc564ea84d4b998d1ff4ef8568ef3635170957f47f08738e8c7ca9e778601d"
})
