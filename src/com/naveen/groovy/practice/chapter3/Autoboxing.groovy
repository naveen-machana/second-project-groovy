package com.naveen.groovy.practice.chapter3

class Autoboxing {
    static void main(String[] args) {
        def i = 2
        println i.class

        def d = 2.2
        println d.class

        println 2.class
        println 2.toFloat()

        3.times { println 'Hi' }

        primitiveParameter(3 as double)

        def sum = 0
        10.times { sum += 0.1 }
        println sum
    }

    private static void primitiveParameter(double totalCost) {
        println totalCost.class
    }
}
