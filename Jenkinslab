pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'javac Addition.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Addition'
            }
        }
    }
}
