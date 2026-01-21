package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitSpringPetclinicGitRefsHeadsMain1 : GitVcsRoot({
    name = "https://DariaKrupkina0066@dev.azure.com/DariaKrupkina0066/TeamCity%20Project/_git/spring-petclinic.git#refs/heads/main (1)"
    url = "https://DariaKrupkina0066@dev.azure.com/DariaKrupkina0066/TeamCity%20Project/_git/spring-petclinic.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "dkrupkina"
        password = "credentialsJSON:0ac8c329-3ec5-41ad-983c-c57eece5188b"
    }
    param("pipelines.connectionId", "PROJECT_EXT_660")
})
