// node {
//   stage('Clone repository') {
//     checkout scm
//   }
//   stage('Build image') {
//     app = docker.build("ghcr.io/tarpha/${env.JOB_NAME}")
//   }
//   stage('Push image') {
//     docker.withRegistry('https://ghcr.io/tarpha', 'ghcr') {
//       app.push("${env.BUILD_NUMBER}")
//       app.push("0.0.1")
//     }
//   }
//   stage('Clean') {
//     deleteDir()
//     echo "End"
//   }
// }

pipeline {
    agent any
    steps {
      stage('Clone repository') {
        checkout scm
      }
      stage('Build image') {
        app = docker.build("ghcr.io/tarpha/${env.JOB_NAME}")
      }
      stage('Push image') {
        docker.withRegistry('https://ghcr.io/tarpha', 'ghcr') {
          app.push("${env.BUILD_NUMBER}")
          app.push("0.0.1")
        }
      }
      stage('Clean') {
        cleanWS()
      }
    }
}