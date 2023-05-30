pipeline {
    agent any
    
    stages {
        stage('Clone repository') {
            steps {
                // Clone the Git repository containing the BDD Selenium project
                git 'https://github.com/your-repo.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build the project (e.g., compile code, resolve dependencies)
                sh 'mvn clean compile'
            }
        }
        
        stage('Run Tests') {
            steps {
                // Execute the BDD tests using the test runner (e.g., Cucumber)
                sh 'mvn test'
            }
        }
        
        stage('Generate Reports') {
            steps {
                // Generate test reports (e.g., Cucumber reports, code coverage reports)
                sh 'mvn verify'
            }
        }
    }
    
    post {
        always {
            // Archive the test reports
            archiveArtifacts artifacts: '**/target/cucumber-reports/*', fingerprint: true
            
            // Publish the test reports using Jenkins' built-in HTML publisher
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/cucumber-reports',
                reportFiles: 'index.html',
                reportName: 'Cucumber Reports'
            ])
        }
    }
}
