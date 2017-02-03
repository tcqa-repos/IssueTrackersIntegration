package issueTrackersIntegration

import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.BugzillaIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.TfsIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker

val YouTrack_6_0 = YouTrackIssueTracker ({
    displayName = "YoutTrack 6.0"
    host = "http://tcqa-youtrack-6"
    userName = "root"
    password = "zxx0feb335798e7f083"
    projectExtIds = "PR"
    useAutomaticIds = true
    param("key", "youtrack1")
})

val Jira = JiraIssueTracker ({
    displayName = "JIRA"
    host = "http://tcqa-issue-trackers:8080/"
    userName = "admin"
    password = "zxx0feb335798e7f083"
    projectKeys = "JTCI"
    param("key", "jira1")
})

val VisualStudioOnline = TfsIssueTracker ({
    displayName = "Visual Studio Online"
    host = "https://tcqagit.visualstudio.com/DefaultCollection/MyFirstProject"
    userName = "julia.reshetnikova@jetbrains.com"
    password = "zxx65836f7859cb56248b3669234530d05bbba00aaea034b0bbfccc564ea84d4b998d1ff4ef8568ef3635170957f47f08738e8c7ca9e778601d"
    pattern = "#(\\d+)"
    param("key", "visualstudioonline1")
})

val GithubCloud = ProjectFeature(null, {
    type = "IssueTracker"
    param("key", "githubissues1")
    param("name", "GitHub")
    param("pattern", """#(\d+)""")
    param("repository", "JuliaResh/IssueTrackersIntegration")
    param("secure:password", "zxx775d03cbe80d301b")
    param("type", "GithubIssues")
    param("username", "")
})

val GithubOAuth = ProjectFeature(null, {
    type = "OAuthProvider"
    param("clientId", "e0090de015ed2bcc3c8e")
    param("displayName", "GitHub.com")
    param("gitHubUrl", "https://github.com/")
    param("providerType", "GitHub")
    param("secure:clientSecret", "zxxc28c7cb30369035c5a9015f85149b54ae51678e0d8c9a83a1c022bf98dd771685c416f4bdc1e8c6b775d03cbe80d301b")
})

val FogBugz = ProjectFeature(null, {
    type = "IssueTracker"
    param("host", "https://tcqa.fogbugz.com/")
    param("key", "fogbugz1")
    param("name", "FogBugz")
    param("pattern", """(\d+)""")
    param("secure:password", "zxx51258c7e47dac515ab5f7ea7ddba4ab2")
    param("type", "fogbugz")
    param("username", "tcqa.user1@gmail.com")
})

val Bugzilla_3_4 = BugzillaIssueTracker({
    displayName = "Bugzilla 3.4"
    host = "http://tcqa-issue-trackers:80/"
    userName = ""
    password = "zxx775d03cbe80d301b"
    issueIdPattern = """#(\d+)"""
    param("key", "bugzilla1")
})

val BitbucketCloud = ProjectFeature(null, {
    type = "IssueTracker"
    param("authType", "anonymous")
    param("host", "https://bitbucket.org/JuliaResh/myproject/")
    param("key", "BitBucketIssues1")
    param("name", "Bitbucket Cloud")
    param("pattern", """#(\d+)""")
    param("repository", "https://bitbucket.org/JuliaResh/myproject")
    param("secure:password", "zxx775d03cbe80d301b")
    param("type", "BitBucketIssues")
    param("username", "")
})

val BitbucketCloudOAuth = ProjectFeature(null, {
    type = "OAuthProvider"
    param("clientId", "za8UbPcuMAEMQrhtm8")
    param("displayName", "Bitbucket Cloud")
    param("providerType", "BitBucketCloud")
    param("secure:clientSecret", "zxx8639f15eb30ea9d5ce081af386d31ade6c39ad8670005e0d057f34b773484a02775d03cbe80d301b")
})

