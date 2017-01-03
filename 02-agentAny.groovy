pipeline {
    agent any
    stages {
        stage ("foo") {
            steps {
                sh('echo "This works"')
            }
        }
    }
}
