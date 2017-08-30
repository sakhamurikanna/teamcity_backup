package TeamcityCourseSpringPetclinic.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.BuildStep
import jetbrains.buildServer.configs.kotlin.v10.BuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object TeamcityCourseSpringPetclinic_Build : BuildType({
    uuid = "f1dfa1e5-32c4-4601-a2a9-41b2480a216f"
    extId = "TeamcityCourseSpringPetclinic_Build"
    name = "Build"

    artifactRules = "target/petclinic.war"

    vcs {
        root(TeamcityCourseSpringPetclinic.vcsRoots.TeamcityCourseSpringPetclinic_HttpsGithubComG0t4teamcityCourseSpringPetclinicGit)

    }

    steps {
        maven {
            name = "compile"
            goals = "clean package"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18_x64%"
        }
        step {
            name = "deploy"
            type = "cargo-deploy-runner"
            param("jetbrains.buildServer.deployer.username", "admin")
            param("jetbrains.buildServer.deployer.sourcePath", "/target/petclinic.war")
            param("jetbrains.buildServer.deployer.targetUrl", "34.202.221.163:8080")
            param("secure:jetbrains.buildServer.deployer.password", "credentialsJSON:89d82ee2-c8b7-428e-bda3-e3020ade2008")
            param("jetbrains.buildServer.deployer.container.type", "tomcat8x")
        }
    }

    triggers {
        vcs {
        }
    }
})
