package DisabledPRs.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object DisabledPRs_BuildBookingAPITests : BuildType({
    name = "Build: BookingAPI tests"

    vcs {
        root(DisabledPRs.vcsRoots.DisabledPRs_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster2)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }

    features {
        perfmon {
        }
    }
})
