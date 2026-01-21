package DisabledPRs.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object DisabledPRs_HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain : GitVcsRoot({
    name = "http://gitlabvcs.qa.teamcity.com/context/test/danila_group1/simplepr1.git#refs/heads/main"
    url = "http://gitlabvcs.qa.teamcity.com/context/test/danila_group1/simplepr1.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_0f9b154f56b79c502df00943e215c62b:1:328456fa-c19b-4c52-b1f1-905366592326"
    }
    param("pipelines.connectionId", "PROJECT_EXT_96")
    param("tokenType", "refreshable")
})
