package com.naveen.groovy.practice.chapter3

class GStrings {
    static void main(String[] args) {
        def name = "John"
        println "hello ${name}. Today is ${new Date()}"

        println "Hell".class
        println "Hello ${name}".class

        def date = new Date()
        def amount = 987.65
        def template = """
        Dear ${name},
        This is a friendly notice that ${amount} was
        deposited in your checking account on ${date}.
        """

        println template
    }
}
