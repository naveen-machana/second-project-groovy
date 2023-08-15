package com.naveen.groovy.practice.dsl.chapter4

class Closures {

    static void main(String[] args) {
        def greeting = 'Hello'
        def greet = { println "$greeting, World!" }
        greet()
        greeting = "Goodbye"
        greet()

        def greet2 = { greetings -> println "$greetings, World!"}
        greet2("hello")

        def greet3 = { String greetings2, name -> println "$greetings2, $name" }
        greet3("goodbye", "freed")

        def fruits = ['apple', 'pear', 'range']
        def likeIt = { fruit -> println "I like ${fruit}s"}
        fruits.each likeIt


    }
}
