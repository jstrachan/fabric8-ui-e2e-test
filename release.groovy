#!/usr/bin/groovy
def ci (){
    stage('functional test'){
       sh './run_functional_tests.sh'
    }
}
return this
