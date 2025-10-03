pipeline {
    agent any
    
    stages {
        stage('Stage 1 - Checkout') {
            steps {
                echo 'Checking out the code...'
            }
        }

        stage('Stage 2 - Build') {
            steps {
                echo 'Building the project...'
            }
        }

        stage('Stage 3 - Unit Tests') {
            steps {
                echo 'Running unit tests...'
            }
        }

        stage('Stage 4 - Static Analysis') {
            steps {
                echo 'Performing static code analysis...'
            }
        }

        stage('Stage 5 - Deploy to Staging') {
            steps {
                echo 'Deploying to staging environment...'
            }
        }

        stage('Stage 6 - Deploy to Production') {
            steps {
                echo 'Deploying to production environment...'
            }
        }
    }
}
