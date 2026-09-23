pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'wsl bash -lc "cd /mnt/c/ProgramData/Jenkins/.jenkins/workspace/calculator-pipeline && mvn clean compile"'
            }
        }

        stage('Test') {
            steps {
                bat 'wsl bash -lc "cd /mnt/c/ProgramData/Jenkins/.jenkins/workspace/calculator-pipeline && mvn test"'
            }
        }

        stage('Package') {
            steps {
                bat 'wsl bash -lc "cd /mnt/c/ProgramData/Jenkins/.jenkins/workspace/calculator-pipeline && mvn package"'
            }
        }

        stage('Deploy') {
            steps {
                bat 'wsl bash -lc "cd /mnt/c/ProgramData/Jenkins/.jenkins/workspace/calculator-pipeline && ansible-playbook -i inventory deploy.yml"'
            }
        }
    }
}
