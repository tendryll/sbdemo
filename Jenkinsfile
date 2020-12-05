#!groovy

node('', {
  stage('build') {
    checkout([$class: 'GitSCM',
              branches: [[name: '*/master']],
              doGenerateSubmoduleConfigurations: false,
              extensions: [],
              submoduleCfg: [],
              userRemoteConfigs: [[url: 'https://github.com/tendryll/sbdemo.git']]])
    echo "path to workspace => ${env.WORKSPACE}"
    sh "${env.WORKSPACE}\\demo-pipeline\\mvnw.cmd clean build"
  }
})
