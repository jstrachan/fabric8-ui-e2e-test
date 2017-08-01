#!/usr/bin/groovy
def ci (){
    commenting out functional tests until we look at this error in the pipeline: `geckodriver: setting permissions to 0755 for /home/jenkins/workspace/-projects_fabric8-ui_PR-668-`
    stage('functional test'){
       sh './run_functional_tests.sh'
    }
}
return this
