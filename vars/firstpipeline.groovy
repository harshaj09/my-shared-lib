import com.digitrends.builds.Calculator
Calculator calculator = new Calculator(this)
pipeline {
    agent any
    environment {
        APPLICATION_NAME = "${pipelineParams.appName}"
    }
    stages {
        stage ('AdditionStage') {
            steps {
                script {
                    echo "sum of 2 numbers"
                    println calculator.add()
                    println calculator.addition(20,40)
                    echo "My microservice name: ${APPLICATION_NAME}"
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
