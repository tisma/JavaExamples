pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build NativeJNA'
        sh 'sh NativeJNA/compile_and_run_java.sh'
      }
    }

  }
}