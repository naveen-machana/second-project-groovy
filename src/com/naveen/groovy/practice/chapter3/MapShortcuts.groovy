package com.naveen.groovy.practice.chapter3

class MapShortcuts {
    static void main(String[] args) {
        def family = [dad:"John" , mom:"Jane" ]
        println family.getClass()

        def empty = [:]
        println empty

        println family.get("dad" )
        println family.dad
        println family['dad']

        family.kid = 'Timmy'
        println family.kid

        family.each { println it }
        family.each { println "$it.value is the $it.key" }
        family.each {k,v -> println "$v is the $k" }

        family.remove('kid')
        println family

        def kids = [kid: 'Timmy']
        family += kids
        family.each {println it }


    }
}
