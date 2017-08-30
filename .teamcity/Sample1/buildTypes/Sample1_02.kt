package Sample1.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Sample1_02 : BuildType({
    template(Sample1.buildTypes.Sample1_Template)
    uuid = "de3eae7b-7ecd-4c6f-89e3-c76bac66b6e6"
    extId = "Sample1_02"
    name = "02"

    steps {
        script {
            name = "install"
            id = "RUNNER_5"
            scriptContent = "npm install"
        }
        stepsOrder = arrayListOf()
    }

    dependencies {
        dependency(Sample1.buildTypes.Sample1_01) {
            snapshot {
            }
        }
    }
})
