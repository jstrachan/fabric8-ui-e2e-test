@Library('github.com/jstrachan/fabric8-pipeline-library@changes')
def utils = new io.fabric8.Utils()
def flow = new io.fabric8.Fabric8Commands()
def project = 'fabric8-ui/fabric8-ui'
def ciDeploy = false
def imageName
node{
    properties([
        disableConcurrentBuilds()
        ])
}

fabric8UITestNode{
    timeout(time: 1, unit: 'HOURS') {
        ws {
            container('ui'){
                stage('functional test') {
                    echo "about to run the CI job!"
                    sh """
                    git clone https://github.com/fabric8-ui/fabric8-ui.git &&
                    cd fabric8-ui &&
                    npm install &&
                    ./run_functional_tests.sh
                    """
                }
            }
        }
    }
}
