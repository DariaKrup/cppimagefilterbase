package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dockerCommand

object BuildDockerGhe : BuildType({
    name = "Build Docker: GHE"
    description = "GitHub Enterprise"

    vcs {
        root(_Self.vcsRoots.HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileGitRefsHeadsMain)
    }

    steps {
        dockerCommand {
            id = "DockerCommand"
            commandType = build {
                source = file {
                    path = "Dockerfile"
                }
            }
        }
    }
})
