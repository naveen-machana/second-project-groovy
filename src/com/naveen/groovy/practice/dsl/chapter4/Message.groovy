package com.naveen.groovy.practice.dsl.chapter4

class AMessage {
    String message

    def to( String person ) {
        println "$message, $person!"
    }
}

def say (String message) {
    new AMessage(message: message)
}

say "Hello" to "Fred"

def greet (String message) {
    [ to : { person -> println "$message, $person" }]
}

greet "hello" to "naveen"
greet('hello')['to'].call('Barney')
