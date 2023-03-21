node {
  stage('Clone repository') {
    checkout scm
  }
  stage('Build image') {
    app = docker.build("ghcr.io/my-image")
  }
  stage('Push image') {
    docker.withRegistry('https://ghcr.io') {
    //   app.push("${env.BUILD_NUMBER}")
      app.push("0.0.1")
    }
  }
}