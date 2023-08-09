package com.naveen.groovy.practice.chapter3

class RangesExample {
    static void main(String[] args) {
        def r = 1..3
        println r.class
        (1..3).each {println it }
        r.each {println it }
        r.each {println "Hi" }
        def today = new Date()
        def nextWeek = today + 7
        (today..nextWeek).each { println it }
        def period = (today..nextWeek)
        println period.size()
        println period.from
        println period.to

        for (i in 1..3) { println "Attempt $i" }

        println r.contains(1) && r.contains(3)
        println r.contains(12)

        println r.reverse()
    }
}
