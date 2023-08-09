package com.naveen.groovy.practice.chapter3

class GroovyTruth {
    static void main(String[] args) {
        if (1) println "1"
        if (-1) println '-1'
        if (!null) println !null
        if ('John') println 'John'
        Map family = [dad: 'John', mom: 'Jane']
        if (family) println family
        String[] sa = new String[1]
        if (sa) println sa

        StringBuffer sb = new StringBuffer()
        sb.append 'Hi'
        if (sb) println sb

        if (0) println 0
        if (null) println null
        if ("") println ""

        family = [:]
        if (family) println family

        sa = new String[0]
        if (sa) println sa

        sb = new StringBuffer()
        if (sb) println sb

        if (args != null && args.length > 0) {
            println 'java way of args checking'
            println args
            File dir = new File(args[0])
            println dir
        }

        if (args) {
            println 'groovy way of args checking'
            println args
            File dir = new File(args[0])
            println dir
        }
    }
}
