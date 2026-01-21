package ProjectWithParameters.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object ProjectWithParameters_HttpsGithubComDariaKrupTeamCityDynamicTestsRefsHeadsMain1 : GitVcsRoot({
    name = "https://github.com/DariaKrup/TeamCityDynamicTests#refs/heads/main (1)"
    url = "https://github.com/DariaKrup/TeamCityDynamicTests"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "DariaKrup"
        password = "credentialsJSON:a9f10039-e193-4665-afab-91b5b38ce930"
    }
    param("pipelines.connectionId", "PROJECT_EXT_238")
})
