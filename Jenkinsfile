pipeline {
    agent any
    
    stages {
        stage('Stage 1 - Checkout') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.checkoutStage()
                }
            }
        }

        stage('Stage 2 - Build') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.buildStage()
                }
            }
        }

        stage('Stage 3 - Unit Tests') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.unitTestStage()
                }
            }
        }

        stage('Stage 4 - Static Analysis') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.staticAnalysisStage()
                }
            }
        }

        stage('Stage 5 - Deploy to Staging') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.deployStagingStage()
                }
            }
        }

        stage('Stage 6 - Deploy to Production') {
            steps {
                script {
                    def stages = load 'stages.groovy'
                    stages.deployProductionStage()
                }
            }
        }
    }
}
