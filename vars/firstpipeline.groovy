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
                mail(
                    def subject = "Jenkins Job status"
                    def body = "Jenkins Build number is: ${currentBuild.number}\n" + "Jenkins job status: ${currentBuild.currentResult}"
                    to: "padmajaganji111@gmail.com",
                    subject: subject,
                    body: body
                )
            }
        }
    }
}
