node {
  stage('Clone repository') {
    checkout scm
  }
  stage('Build image') {
    app = docker.build("ghcr.io/tarpha/${env.JOB_NAME}")
  }
  stage('Push image') {
    docker.withRegistry('https://ghcr.io/tarpha', 'github') {
      app.push("${env.BUILD_NUMBER}")
      app.push("0.0.1")
    }
  }
}