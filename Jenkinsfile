pipeline {
    agent any
    
    stages {
        stage('Stage 1 - Checkout') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.checkoutStage('main')  // passing branch name
                }
            }
        }

        stage('Stage 2 - Build') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.buildStage('Release')  // passing build type
                }
            }
        }

        stage('Stage 3 - Unit Tests') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.unitTestStage('Regression')  // passing test suite
                }
            }
        }

        stage('Stage 4 - Static Analysis') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.staticAnalysisStage('SonarQube')  // passing tool name
                }
            }
        }

        stage('Stage 5 - Deploy to Staging') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.deployStagingStage('Staging-Env')  // passing environment
                }
            }
        }

        stage('Stage 6 - Deploy to Production') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.deployProductionStage('Prod-Env', 'v1.2.0')  // passing env & version
                }
            }
        }
    }
}
