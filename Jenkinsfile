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

// pipeline {
//   environment { 
//       repository = "ghcr.io/tarpha/$JOB_NAME"  //docker hub id와 repository 이름
//       dockerImage = '' 
//   }
//   agent any
//   stages {
//     stage('Clone repository') {
//       steps {
//         checkout scm
//       }
//     }
//     stage('Build image') {
//       steps {
//         script { 
//           dockerImage = docker.build repository + ":$BUILD_NUMBER" 
//         }

//         // app = docker.build("ghcr.io/tarpha/${env.JOB_NAME}")
//       }
//     }
//     stage('Push image') {
//       steps {
//         script {
//           docker.withRegistry('https://ghcr.io/tarpha', 'ghcr') {
//             dockerImage.push("${env.BUILD_NUMBER}")
//             dockerImage.push("0.0.1")
//           }
//         }
//       }
//     }
//   }
//   post {
//     always {
//       cleanWs()
//     }
//   }
// }

loadDefault