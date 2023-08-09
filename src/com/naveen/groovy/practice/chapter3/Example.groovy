package com.naveen.groovy.practice.chapter3

class Example {
    static void pipeline (final Closure closure) {
        def dsl = new PipelineDsl()
        closure.delegate = dsl
    }
}

class PipelineDsl {
    void agent() {

    }

    void environment (final Closure closure) {

    }

    void stages( final Closure closure) {

    }
}