package ProjectWithParameters.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.HgVcsRoot

object ProjectWithParameters_A : HgVcsRoot({
    name = "a"
    url = "aaa"
    userName = "a"
    password = "credentialsJSON:c758946a-11a2-423d-a7cf-bef4f7f6bc42"
})
