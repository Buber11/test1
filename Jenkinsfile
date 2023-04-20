pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/Buber11/test1.git'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -B compile '
      }
    }
    stage('Test') {
      steps {
        sh 'mvn -B test '
      }
    }
  }
}