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
         withMaven(maven : 'apache-maven-3.6.1') {
                        bat'mvn clean compile'
                    }
      }
    }
    stage('Test') {
      steps {
         withMaven(maven : 'apache-maven-3.6.1') {
                        bat'mvn clean compile'
                    }
      }
    }
  }
}