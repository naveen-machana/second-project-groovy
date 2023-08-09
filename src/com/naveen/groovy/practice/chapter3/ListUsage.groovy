package com.naveen.groovy.practice.chapter3

class ListUsage {
    static void main(String[] args) {
        def shoppingList = []
        def add = shoppingList.&add
        def remove = shoppingList.&remove
        add "one"
        add 'two'
        add 'three'
        remove 'two'
        add 'four'
        println shoppingList
        printSomething()
    }

    static void printSomething() {
        println 'This method is to show how to call printSomething method'
        println 'Notice this method takes no parameters'
    }
}
