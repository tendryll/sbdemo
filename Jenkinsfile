#!groovy

node('', {
  stage('checkout') {
    checkout([$class: 'GitSCM',
              branches: [[name: '*/master']],
              doGenerateSubmoduleConfigurations: false,
              extensions: [],
              submoduleCfg: [],
              userRemoteConfigs: [[url: 'https://github.com/tendryll/sbdemo.git']]])
  }
  stage('build') {
    sh "mvn clean verify"
  }
  stage('image') {
    sh "docker build -t tendryll/sbdemo ."
  }
})
