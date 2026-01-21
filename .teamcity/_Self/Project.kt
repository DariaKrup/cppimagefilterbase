package _Self

import _Self.buildTypes.*
import _Self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudImage
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudProfile

object Project : Project({
    description = "Project with all VCS connections and providers"

    vcsRoot(HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster2)
    vcsRoot(HttpsGithubComDariaKrupBookingApiPayconiqRefsHeadsMaster1)
    vcsRoot(HttpsGithubComDariaKrupRayTracingGitRefsHeadsMain)
    vcsRoot(HttpsGheQaTeamcityComDariaKrupkina2sampleDockerfileGitRefsHeadsMain)
    vcsRoot(HttpsGithubComDariaKrupMavenUnbalancedMessagesGitRefsHeadsMaster)
    vcsRoot(Http101289311jetbrainsJavaMavenJunitGitRefsHeadsMaster)
    vcsRoot(HttpsGithubComDariaKrupCommandLineRunnerGitRefsHeadsMaster)
    vcsRoot(HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitSpringPetclinicGitRefsHeadsMain1)
    vcsRoot(HttpsGithubComDariaKrupMavenUnbalancedMessagesGitRefsHeadsMaster1)
    vcsRoot(HttpsDariaKrupkina0066devAzureComDariaKrupkina0066TeamCity20ProjectGitSpringPetclinicGitRefsHeadsMain)

    buildType(BuildDockerGhe)
    buildType(BuildBookingGitHubCom)
    buildType(BuildPetClinicAzurePat)

    params {
        param("teamcity.internal.pipelines.creation.enabled", "true")
    }

    features {
        amazonEC2CloudImage {
            id = "PROJECT_EXT_702"
            profileId = "amazon-60"
            agentPoolId = "-2"
            imagePriority = 2
            name = "Ubuntu"
            vpcSubnetId = "subnet-043178c302cabfe37"
            keyPairName = "daria.krupkina"
            instanceType = "t2.medium"
            securityGroups = listOf("sg-072d8bfa0626ea2a6")
            source = Source("ami-084129336a1c2bf43")
        }
        amazonEC2CloudProfile {
            id = "amazon-60"
            enabled = false
            name = "AWS EC2"
            serverURL = "http://10.128.93.57:8281/"
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.EU_WEST_DUBLIN
            awsConnectionId = "AmazonWebServicesAws_2"
        }
    }

    subProject(ProjectWithParameters.Project)
    subProject(DisabledPRs.Project)
})
