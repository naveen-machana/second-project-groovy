package com.naveen.groovy.practice.chapter3

class ClosuresExamples {
    static void main(String[] args) {
        def hi = { println 'Hi' }
        hi()

        hi = { println "Hi $it" }
        hi('Naveen')
        hi 'Kumar'

        def convertToCelsius = { return (5.0/9.0) * (it.toFloat() - 32.0) }
        [0, 32, 70, 100].each { println "$it degrees fahrenheit in celsius: ${convertToCelsius(it)}"}

        def calculateTax = {taxRate, amount -> return amount + (taxRate * amount)}
        println "Total cost: ${calculateTax(0.055, 100)}"

        def tax = calculateTax.curry(0.1)
        [10, 20, 30].each { println "Total cost: ${tax(it)}"}
    }
}
