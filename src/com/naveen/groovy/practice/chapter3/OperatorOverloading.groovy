package com.naveen.groovy.practice.chapter3

class OperatorOverloading {
    static void main(String[] args) {
        def d = new Date()
        println d.next()

        (1..3).each { println d++ }
    }
}
