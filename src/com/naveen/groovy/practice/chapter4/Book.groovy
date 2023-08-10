package com.naveen.groovy.practice.chapter4

class Book {
    String title
    String author
    Integer pages


    static void main(String[] args) {
        println Book.getDeclaredField("title" )
        println Book.getDeclaredMethod("getTitle" )

        Book book = new Book()
        book.title = 'Groovy Recipes'
        println book.title
        println book.getTitle()

        book.setProperty("title" , "Groovy Recipes" )
        //book.title = "Groovy Recipes"
        //book.setTitle("Groovy Recipes")
        println book.getProperty("title" )
        //println book.title
        //println book.getTitle()

        def prop = "title"
        def value = "Groovy Recipes"
        book."${prop}" = value
        println book."${prop}"

        def book2 = new Book2()
        // Yikes, this should not have worked
        book2.titleWithPrivateModifier = 'test'
        println book2.titleWithPrivateModifier

        def book3 = new Book3()
        book3.titleWithPrivateModifier = 'xyz'
        println book3.titleWithPrivateModifier
        // though poke is a private method on book3, we can still call it
        println book3.poke()

        Book book1 = new Book(title:"Groovy Recipes" , author:"Scott Davis" , pages:250)
        Book book4 = new Book(pages:230, author:"Scott Davis" ,
                title:"GIS for Web Developers" )
        Book book5 = new Book(title:"Google Maps API" )
        Book book6 = new Book()
    }
}
