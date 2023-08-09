package com.naveen.groovy.practice.chapter3

class ListShortcuts {
    static void main(String[] args) {
        def languages = ['Java', 'Groovy', 'JRuby']
        println languages.class

        def strings = ['Java', 'Groovy', 'JRuby'] as String[]
        println strings.class

        def set = ['Java', 'Groovy', 'JRuby'] as Set
        println set.class

        def empty = []
        println empty.size()

        def additionToList = ['Java', 'Groovy']
        additionToList << 'Jython'
        println additionToList

        println languages[2]
        languages[2] = 'Jython'
        println languages[2]

        languages.each { println it }
        languages.each { language -> println language }

        for (def lang in languages) {
            println lang
        }

        languages.eachWithIndex{ lang, i -> println "$i : $lang" }
        languages.sort()
        println languages

        def newlist = languages.reverse()
        println newlist

        languages.pop()
        println languages

        def others = ['python', 'sql']
        languages += others
        println languages

        println languages.findAll { it.startsWith('s') }

        println languages.collect { it += ' is cool' }

        languages << others
        println languages
        println languages.flatten()

        def params = []
        params << "jdbc:url"
        params << "com.mysql.jdbc.Driver"
        params << "someuser"
        params << "password"

        connect(*params)
    }

    static void connect(String one, String two, String three, String four) {
        println "$one $two $three $four"
    }
}
