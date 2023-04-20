pipeline {
  agent any
  tools{
    Maven "M3"
  }
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/Buber11/test1.git'
      }
    }
    stage('Build') {
      steps {
        bat 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }
  }
}