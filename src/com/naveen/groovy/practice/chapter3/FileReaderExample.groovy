package com.naveen.groovy.practice.chapter3

class FileReaderExample {
    static void main(String[] args) {
        new File('./hello.txt').eachLine { println it }
        def reader = new FileReader("./hello.txt")

        try {
            Reader reader2 = new FileReader('./hello.txt');
        }
        catch (FileNotFoundException e) {
            e.printStackTrace()
        }
    }
}
