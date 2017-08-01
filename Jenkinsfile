@Library('github.com/fabric8io/fabric8-pipeline-library@master')
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
//fabric8UITemplate{
    //dockerNode{
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
    //}
}
