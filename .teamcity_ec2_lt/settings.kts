import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudImage
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudProfile
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.pipelines.*
import jetbrains.buildServer.configs.kotlin.triggers.vcs

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2025.11"

project {

    features {
        amazonEC2CloudImage {
            id = "PROJECT_EXT_1028"
            profileId = "amazon-64"
            agentPoolId = "-2"
            name = "Launch template for Ubuntu AWS lt (dkrupkina_ubuntu)"
            vpcSubnetId = "subnet-043178c302cabfe37,subnet-0c4f70b91d8800740"
            keyPairName = "daria.krupkina"
            instanceType = "t2.medium"
            securityGroups = listOf("sg-072d8bfa0626ea2a6")
            customizeLaunchTemplate = true
            source = LaunchTemplate(templateId = "lt-005cb4d2df991cc44", version = AmazonEC2CloudImage.LATEST_VERSION)
        }
        amazonEC2CloudImage {
            id = "PROJECT_EXT_812"
            profileId = "amazon-64"
            agentPoolId = "-2"
            name = "Ubuntu AMI"
            vpcSubnetId = "subnet-043178c302cabfe37,subnet-0c4f70b91d8800740"
            keyPairName = "daria.krupkina"
            instanceType = "t2.medium"
            securityGroups = listOf("sg-072d8bfa0626ea2a6")
            source = Source("ami-0817025aa39c203c6")
        }
        amazonEC2CloudProfile {
            id = "amazon-64"
            name = "EC2 Cloud"
            serverURL = "http://10.128.93.57:8281"
            terminateIdleMinutes = 30
            region = AmazonEC2CloudProfile.Regions.EU_WEST_DUBLIN
            awsConnectionId = "AmazonWebServicesAws_2"
        }
    }

    pipeline(CppEc2launchTemplate)
}


object CppEc2launchTemplate : Pipeline({
    name = "CPP: EC2 launch template"

    repositories {
        repository(DslContext.settingsRoot)
    }

    triggers {
        vcs {
        }
    }

    job(CppEc2launchTemplate_Job1)
})

object CppEc2launchTemplate_Job1 : Job({
    id("Job1")
    name = "Job 1"

    steps {
        script {
            name = "CMD"
            scriptContent = "echo 'C++'"
        }
    }
})
