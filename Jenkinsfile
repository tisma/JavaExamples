pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build NativeJNA'
        sh '''cd NativeJNA
sh compile_and_run_java.sh'''
      }
    }

  }
}