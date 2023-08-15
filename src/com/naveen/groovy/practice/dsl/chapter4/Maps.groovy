package com.naveen.groovy.practice.dsl.chapter4

class Maps {
    static void main(String[] args) {
        def fruits = ["apple" : 20, "orange" : 25, "pear" : 20]
        println fruits['apple']
        println fruits.apple
        println fruits.get('apple')
        println fruits.get('apple2', 5)

        def empty = [:]
        assert empty instanceof Map
        assert empty.size() == 0
        fruits['apple'] = 21
        assert fruits.apple == 21
        assert fruits.grape == null

        def one = [one : 'one']
        def two = [ two: 'two']
        def three = [ one: 'one', two: 'two']
        assert one + two == three
    }
}
