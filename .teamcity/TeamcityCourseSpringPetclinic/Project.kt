package TeamcityCourseSpringPetclinic

import TeamcityCourseSpringPetclinic.buildTypes.*
import TeamcityCourseSpringPetclinic.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "91994180-b072-4f84-953d-36ebe0787c4b"
    extId = "TeamcityCourseSpringPetclinic"
    parentId = "_Root"
    name = "Teamcity Course Spring Petclinic"

    vcsRoot(TeamcityCourseSpringPetclinic_HttpsGithubComG0t4teamcityCourseSpringPetclinicGit)

    buildType(TeamcityCourseSpringPetclinic_Build)
})
