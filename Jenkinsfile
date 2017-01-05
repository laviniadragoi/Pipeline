//the following Jenkinsfile:

node {
    checkout scm
}
//is equivalent to something like this:
/*
node {
    checkout([
         $class: 'GitSCM',
         branches: scm.branches,
         doGenerateSubmoduleConfigurations: scm.doGenerateSubmoduleConfigurations,
         extensions: scm.extensions,
         userRemoteConfigs: scm.userRemoteConfigs
    ])
 }
 */
