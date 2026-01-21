package DisabledPRs

import DisabledPRs.buildTypes.*
import DisabledPRs.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("DisabledPRs")
    name = "Disabled PRs"

    vcsRoot(DisabledPRs_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster)
    vcsRoot(DisabledPRs_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster1)
    vcsRoot(DisabledPRs_HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster2)
    vcsRoot(DisabledPRs_HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileGitRefsHeadsMain)
    vcsRoot(DisabledPRs_HttpGitlabvcsQaTeamcityComContextTestDanilaGroup1simplepr1gitRefsHeadsMain)
    vcsRoot(DisabledPRs_HttpsGithubComDariaKrupAntProjectRefsHeadsMaster)
    vcsRoot(DisabledPRs_HttpsGithubComDariaKrupGradleSimpleRefsHeadsMaster)
    vcsRoot(DisabledPRs_HttpsGithubComDariaKrupJavaMavenDemoRefsHeadsMaster)

    buildType(DisabledPRs_BuildBookingAPITests)
})
