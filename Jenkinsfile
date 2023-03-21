node {
  stage('Clone repository') {
    checkout scm
  }
  stage('Build image') {
    app = docker.build("ghcr.io/tarpha/cm-common-grpc-client")
  }
  stage('Push image') {
    docker.withRegistry('https://ghcr.io/tarpha', 'ghcr') {
    //   app.push("${env.BUILD_NUMBER}")
      app.push("0.0.1")
    }
  }
}