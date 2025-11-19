pipeline{
  agent any
  tools{
    maven 'DevOps_Maven'
  }
  triggers{
    githubPush()
  }
  environment{
      POM="jugandoArreglos/pom.xml"
  }
  stages{
    stage('Descarga'){
      steps{
        git url:'https://github.com/MrBrian7166/Play_ArreglosBDC.git', branch:'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B package'
      }
    }
    stage ('Prueba'){
      steps{
        sh 'mvn -f $POM -B test'
      }
      post{
        always{
          junit 'playArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar',fingerprint:true
      }
    }
  }
}
