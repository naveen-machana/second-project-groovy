package com.naveen.groovy.practice.dsl.chapter4

class OperatorOverloading {
    static void main(String[] args) {
        ComplexNumber one = new ComplexNumber([real: 1, img: 2])
        ComplexNumber two = new ComplexNumber([real: 3, img: 4])

        println one + two
    }
}

class ComplexNumber {
    def real, img

    ComplexNumber plus(ComplexNumber other) {
        new ComplexNumber([real: real + other.real, img: img + other.img])
    }

    String toString() {
        real + ' + i' + img
    }
}
