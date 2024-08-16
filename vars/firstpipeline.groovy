import com.digitrends.builds.Calculator

Calculator calculator = new Calculator(this)
pipeline {
    agent {
        label "slave"
    }
    stages {
        stage ('AdditionStage') {
            steps {
                script {
                    echo "sum of 2 numbers"
                    println calculator.addition(10,20)
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
