pipeline {
    agent any
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
//                 sh 'sudo mvn -B -DskipTests clean package'
                sh 'sudo rm -rf /var/lib/jenkins//workspace/TSIFullStack/Movie_project_git'
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
