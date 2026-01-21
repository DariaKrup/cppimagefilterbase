package DisabledPRs.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object DisabledPRs_HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileGitRefsHeadsMain : GitVcsRoot({
    name = "https://ghe.qa.teamcity.com/daria-krupkina2/sample-dockerfile.git#refs/heads/main"
    url = "https://ghe.qa.teamcity.com/daria-krupkina2/sample-dockerfile.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "daria-krupkina2"
        password = "credentialsJSON:d341dceb-f030-40f6-9c3b-c6918cce9ee4"
    }
    param("pipelines.connectionId", "PROJECT_EXT_649")
})
