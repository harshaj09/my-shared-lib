import com.digi-trends.builds.Calculator
Calculator calci = new Calculator(this)
pipeline {
    agent any 
    stages {
        stage ('AdditionStage') {
            steps {
                script {
                    echo "sum of 2 numbers"
                    println calci.add()
                    println calci.addition(20,40)
                }
            }
        }
        stage ('MultiplicationStage') {
            steps {
                script {
                    echo "Multiplication of 2 numbers"
                    println calci.multiplication(10,20)
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