package Sample1

import Sample1.buildTypes.*
import Sample1.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "cbf73762-b21c-4999-85d8-ca4d8c458369"
    extId = "Sample1"
    parentId = "_Root"
    name = "Sample1"

    vcsRoot(Sample1_HttpsGithubComG0t4teamcityCourseCardsGit)

    buildType(Sample1_02)
    buildType(Sample1_01)

    template(Sample1_Template)
})
