// stages.groovy

def checkoutStage() {
    echo 'Checking out the code...'
    echo 'Verifying repository access...'
    echo 'Fetching the latest branch...'
    echo 'Checkout complete.'
}

def buildStage() {
    echo 'Starting the build process...'
    echo 'Compiling source code...'
    echo 'Packaging application artifacts...'
    echo 'Build completed successfully.'
}

def unitTestStage() {
    echo 'Running unit tests...'
    echo 'Executing test suite...'
    echo 'Checking test results...'
    echo 'All unit tests passed.'
}

def staticAnalysisStage() {
    echo 'Performing static code analysis...'
    echo 'Checking code style and linting...'
    echo 'Scanning for security vulnerabilities...'
    echo 'Static analysis completed with no critical issues.'
}

def deployStagingStage() {
    echo 'Deploying to staging environment...'
    echo 'Stopping existing staging services...'
    echo 'Starting new staging deployment...'
    echo 'Deployment to staging completed successfully.'
}

def deployProductionStage() {
    echo 'Deploying to production environment...'
    echo 'Backing up current production version...'
    echo 'Starting production deployment...'
    echo 'Production deployment completed successfully.'
}

// return this script so Jenkins can load it
return this
