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
            dir("C:\Users\Użytkownik\.jenkins\workspace\test"){
                sh 'mvn clean compile'
            }
        }
    }
  }
}