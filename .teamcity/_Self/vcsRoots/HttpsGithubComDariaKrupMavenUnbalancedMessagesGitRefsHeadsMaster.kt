package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComDariaKrupMavenUnbalancedMessagesGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/DariaKrup/maven_unbalanced_messages.git#refs/heads/master"
    url = "https://github.com/DariaKrup/maven_unbalanced_messages.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
