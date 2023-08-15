package com.naveen.groovy.practice.dsl.chapter4

class NullSafeDereference {
    static void main(String[] args) {
        Customer2 customer = null
        println customer?.name

        // equivalient to
        if (customer != null)
            println customer.name
    }
}

class Customer2 {
    String name
}
