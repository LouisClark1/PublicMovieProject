pipeline {
    agent any
    options {
        skipDefaultCheckout()
    }
    tools {
        maven "MavenInstall"
        jdk "JDK"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
        stage('Build') {
            steps {
                dir("/var/lib/jenkins//workspace/TSIFullStack/Movie_project_git") {
                    sh'git config --global user.name "LouisClark1"'
//                 sh 'sudo mvn clean package'
                    checkout scm
//                 sh 'sudo su'
//                 sh 'sudo rm -rf /var/lib/jenkins//workspace/TSIFullStack/Movie_project_git'
                    
                }
            }
        }
     }
    post {
       always {
          junit(
        allowEmptyResults: true,
        testResults: '*/test-reports/.xml'
      )
      }
   } 
}
