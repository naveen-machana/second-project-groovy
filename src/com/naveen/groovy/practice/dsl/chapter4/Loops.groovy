package com.naveen.groovy.practice.dsl.chapter4

class Loops {
    static void main(String[] args) {
        int n = 0
        while ( n++ < 10) {
            println n
        }

        for ( n2 in 0..10) println n2

        for (x in ["apple", "orange", "pear"]) println x

        for ( c in 'Hello world') println c

        def inclusive = 1..10
        def exclusive = 'a'..<'e'
        def inclusiveValues = inclusive.collect { it }
        def exclusiveValues = exclusive.collect { it }
        println inclusiveValues
        println exclusiveValues

        def numbers = 1..100
        def letters = 'a'..'z'
        assert numbers.from == 1
        assert numbers.to == 100
        assert letters.from == 'a'
        assert numbers.contains(2)
        assert 5 in numbers

        def numbersList = [1,2,3,4,5,6,7,8,9,10]
        def numberRange = 1..10
        assert numbersList == numberRange

        def res = [1,3,5] + ['apple', 'orange', 'pear']
        def res2 = [1,3,5] + [['apple', 'orange', 'pear']]
        println res
        println res2
        def container =  [1,3,5] << [6]
        def container2 =  [1,3,5] << 6
        println container
        println container2
    }
}
