package Sample1.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Sample1_01 : BuildType({
    uuid = "223dce7e-6c13-4aab-9947-e45de4683953"
    extId = "Sample1_01"
    name = "01"

    vcs {
        root(Sample1.vcsRoots.Sample1_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "npm install"
            scriptContent = "npm install"
        }
        script {
            name = "npm PhantomJS"
            scriptContent = "npm test -- --single-run --browsers PhantomJS --colors"
        }
    }
})
