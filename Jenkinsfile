pipeline {
  agent any
  tools{
    maven "M3"
    jdk "JDK"
  }
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/Buber11/test1.git'
      }
    }
    stage('Build') {
      steps {
            sh 'mvn clean compile'
        }
    }
  }
}