package com.naveen.groovy.practice.dsl.chapter5

class ClosureSamples {
    static void main(String[] args) {
        Closure greeter = { println it }
        def flints = ['Fred', 'Barney']
        flints.each greeter

        greeter.call('one')

        def number = 1
        number.each greeter

        def aString = 'a string'
        aString.each greeter

        def indexOf = flints.findIndexOf (0) { it == 'Wilma' }
        println indexOf

        lockAndCall { println "Closure called" }
        applyClosureOnInput(6) { println it * it }
        applyClosureOnFewInputs(6, 5) { println it * it }
        withCustomer(12345) { customer -> println "Found customer $customer" }
    }

    static void lockAndCall (Closure c) {
        println "before closure call"
        c.call()
        println "after closure call"
    }

    static void applyClosureOnInput(int someInt, Closure c) {
        c.call(someInt)
    }

    static void applyClosureOnFewInputs(int someInt, int secondInt, Closure c) {
        println "secondInt $secondInt ignored from closure"
        c.call(someInt)
    }

    static def withCustomer(id, Closure c) {
        def cust = getCustomerRecord(id)
        c.call(cust)
    }

    static def getCustomerRecord(int custId) {
        return "Customer $custId"
    }

}
