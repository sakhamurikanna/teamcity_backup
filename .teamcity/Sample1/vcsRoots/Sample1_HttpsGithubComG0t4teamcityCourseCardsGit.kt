package Sample1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Sample1_HttpsGithubComG0t4teamcityCourseCardsGit : GitVcsRoot({
    uuid = "a6db294e-326d-4a17-be8a-c9c47d8bafa9"
    extId = "Sample1_HttpsGithubComG0t4teamcityCourseCardsGit"
    name = "https://github.com/g0t4/teamcity-course-cards.git"
    url = "https://github.com/g0t4/teamcity-course-cards.git"
})
