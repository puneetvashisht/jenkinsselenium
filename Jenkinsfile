pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                echo 'mvn clean'
            }
        }
        
        stage('Package') {
            steps {
                echo 'mvn package -DskipTests'
            }
        }
        
        stage('Third') {
            steps {
                echo 'third stage'
            }
        }
        
    }
}
