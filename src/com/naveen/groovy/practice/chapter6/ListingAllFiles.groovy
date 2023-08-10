package com.naveen.groovy.practice.chapter6

import groovy.io.FileType

class ListingAllFiles {
    static void main(String[] args) {
        new File('.').eachFile { println it }

        new File('.').eachDir  { println it }
        new File('.').eachDirRecurse  { println it }
        println '\n'
        new File('.').eachFileRecurse(FileType.FILES) { println it }
        new File('.').eachFileRecurse { if (it.name.endsWith(".java")) {
            println it
        }}
    }
}
