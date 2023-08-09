package com.naveen.groovy.practice.chapter3

class SafeDereferencing {
    static void main(String[] args) {
        def s = 'Jane'
        s.size()

        s = null
        // will throw nullPointerException
        //s.size()

        // below stmt wont throw NPE
        s?.size()

        Person person = new Person()
        println person?.address?.phoneNumber
    }

    static class PhoneNumber {
        String number;
    }

    static class Person {
        Address address;
    }

    static class Address {
        PhoneNumber phoneNumber;
    }
}
