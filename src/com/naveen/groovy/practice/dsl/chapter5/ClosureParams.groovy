package com.naveen.groovy.practice.dsl.chapter5

class ClosureParams {
    static void main(String[] args) {
        def defaultParams = { println it }
        def dynamicParams = { something -> println something }
        def intParams = { int something -> println something }
        def stringParams = { String something -> println something }
        def noParams = { -> }
        defaultParams 1
        defaultParams "String"
        dynamicParams 1
        dynamicParams "String"
        intParams 1
        stringParams "String"
        noParams ()
        defaultParams 1, 2, 3
    }
}
