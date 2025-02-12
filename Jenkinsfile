pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Alvaade/otp1-s25.git'
            }
        }
        stage('Build') {
            steps {
                bat 'clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}
