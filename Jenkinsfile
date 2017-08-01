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

fabric8UINode{
    timeout(time: 1, unit: 'HOURS') {
        ws {
            checkout scm
            readTrusted 'release.groovy'
            def pipeline = load 'release.groovy'

            container('ui'){
                pipeline.ci()
            }
        }
    }
}
