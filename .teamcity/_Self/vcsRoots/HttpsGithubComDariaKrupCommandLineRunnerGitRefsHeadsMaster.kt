package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupCommandLineRunnerGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/DariaKrup/command_line_runner.git#refs/heads/master"
    url = "https://github.com/DariaKrup/command_line_runner.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
