//the following Jenkinsfile:

node {
    checkout scm
    echo "The repo was checked"
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
