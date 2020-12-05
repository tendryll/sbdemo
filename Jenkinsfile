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
    echo "path to workspace => ${env.WORKSPACE}"
    sh "mvn clean verify"
  }
})
