package com.naveen.groovy.practice.dsl.chapter5

class CThread extends Thread {
    Closure closure
    CThread( Closure c ) {
        this.closure = c
        this.start()
    }
    void run() {
        if (closure) closure()
    }

    static void main(String[] args) {
        CThread up = new CThread( {
            for (i in 1..9) {
                sleep(i)
                println i
            }
        })

        CThread down = new CThread ({
            ["three", "two", "one", "liftoff"].each {
                sleep(100)
                println it
            }
        })
    }
}
