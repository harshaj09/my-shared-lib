import com.accenture.builds.Calculator
def call(Map pipelineParams) {
    Calculator calci = new Calculator(this)
    pipeline {
        agent any
        stages {
            stage ('AdditionStage') {
                steps {
                    script {
                        echo "Sum of 2 numbers"
                        println calci.addition(15,20)
                    }
                }
            }
            stage ('MultiplicationStage') {
                steps {
                    script {
                        echo "Multiplication of 2 numbers"
                        println calci.multi(30,20)
                    }
                }
            }
            stage ('Mail') {
                steps {
                    echo "Sending an email !!!"
                }
            }
        }
        post {
            always {
                script {
                    def subject = "Jenkins Job status: ${currentBuild.currentResult}"
                    def body = "Build Number is: ${currentBuild.number}\n" + "Job status is: ${currentBuild.currentResult}\n" + "Job URL: ${env.BUILD_URL}"
                    mail ( to: "padmajaganji111@gmail.com", subject: subject, body: body )
                }
            }
        }
    }
}
