package com.accenture.builds;
class Calculator {
    def jenkins
    Calculator(jenkins) {
        this.jenkins = jenkins
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
    def multi(p,q) {
        return p*q
    }
}