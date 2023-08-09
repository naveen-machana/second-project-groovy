package com.naveen.groovy.practice.chapter3

class Person {
    String firstName
    String lastName

    int add(int a, int b) {
        // notice missing return stmt
        a + b
    }

    void printSomething() {
        println 'This method is to show how to call printSomething method'
        println 'Notice this method takes no parameters'
    }

    static void main(String[] args) {
        def person = new Person()
        person.setFirstName('first')
        person.setLastName('second')
        println person.getFirstName()
        println person.getLastName()
        println person.firstName
        println person.lastName
        person.firstName = 'changed'
        println person.firstName
        def printSomethingOnPerson = person.&printSomething
        printSomethingOnPerson

        println person.add(1,2)
    }
}
