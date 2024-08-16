package com.digitrends.builds;
class Calculator {
    def jenkins // defining a member variable
    Calculator(jenkins) { // creating constructer with a parameter 
        this.jenkins=jenkins // constructor using parameter jenkins and assigning to the member variable
    }
    def add() {
        firstnumber = 10
        secondnumber = 20
        sum = firstnumber+secondnumber
        println sum
    }
    def addition(x,y) {
        return x+y
    }
    def multiplication(p,q) {
        return x*y
    }
}
