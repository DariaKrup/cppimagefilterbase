package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupRayTracingGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/DariaKrup/RayTracing.git#refs/heads/main"
    url = "https://github.com/DariaKrup/RayTracing.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
