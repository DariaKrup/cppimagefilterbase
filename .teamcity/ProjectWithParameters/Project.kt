package ProjectWithParameters

import ProjectWithParameters.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("ProjectWithParameters")
    name = "Project with parameters"

    vcsRoot(ProjectWithParameters_HttpsGithubComDariaKrupTeamCityDynamicTestsRefsHeadsMain1)
    vcsRoot(ProjectWithParameters_A)
    vcsRoot(ProjectWithParameters_HttpsGithubComDariaKrupCommandLineRunnerRefsHeadsMaster)
})
