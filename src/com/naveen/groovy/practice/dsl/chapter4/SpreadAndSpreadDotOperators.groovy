package com.naveen.groovy.practice.dsl.chapter4

class SpreadAndSpreadDotOperators {
    static void main(String[] args) {
        def map = [a: 'apple', o: 'orange', p: 'pear']
        def keys = ['a', 'o', 'p']
        assert map*.key == keys
        def extractKeys = map*.key
        println extractKeys

        def names = ['naveen', 'kumar']
        def print2Names = { one, two -> println "$one, $two" }
        print2Names(*names)
    }
}
