pipeline {
    agent any
            parameters {
                string(name: 'Imagem', defaultValue: 'jenkins1', description: 'Nome da imagem')
            }
            stages {
                stage ('Criar .jar') {
                    steps {
                        sh 'javac Calculadora.java'
                        sh 'jar cfe calc.jar Calculadora Calculadora.class'
                    }   
                }
                stage ('Criar Imagem') {
                    steps {
                        sh 'docker rmi -f $Imagem'
                        sh 'docker build -t $Imagem .'
                    }   
                } 
                stage ('Enviar para o Nexus') {
                    steps {
                        withCredentials([usernamePassword(credentialsId: 'nexus', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker login -u $USER -p $PASS localhost:8082'
                        }
                        sh 'docker tag $Imagem localhost:8082/$Imagem:1.0'
                        sh 'docker push localhost:8082/$Imagem:1.0'
                    }   
                }
                stage ('Criar artefato no raw') {
                    steps {
                        withCredentials([usernamePassword(credentialsId: 'nexus', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'curl -v --user $USER:$PASS --upload-file calc.jar http://nexus:8081/repository/raw_repo/'
                        }
                    }   
                }
                stage('Clean') {
                    steps {
                        cleanWs()
                    }
                }
            }
}