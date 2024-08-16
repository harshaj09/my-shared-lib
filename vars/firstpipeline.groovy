import com.digitrends.builds.Calculator
def call(Map pipelineParams) {
    Calculator calculator = new Calculator(this)
    pipeline {
        agent any
        environment {
            APP_NAME = "${pipelineParams.appName}"
        }
        stages {
            stage ('AdditionStage') {
                steps {
                    script {
                        echo "sum of 2 numbers"
                        println calculator.addition(10,20)
                        echo "Microservice is : ${APP_NAME}"
                    }
                }
            }
            stage ('MultiplicationStage') {
                steps {
                    script {
                        echo "Multiplication of 2 numbers"
                        println calculator.multiplication(10,20)
                    }
                }
            }
            stage ('Mail') {
                steps {
                    echo "Sending an email"
                }
            }
        }
    }  
}
