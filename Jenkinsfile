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
         withMaven(maven : 'M3') {
            bat 'mvn clean compile'
                    }
      }
    }
    stage('Test') {

    }
  }
}