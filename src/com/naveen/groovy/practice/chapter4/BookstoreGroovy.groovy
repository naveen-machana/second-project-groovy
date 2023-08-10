package com.naveen.groovy.practice.chapter4

class BookstoreGroovy implements Bookstore {
    Book b
    Publisher publisher

    Book makeBook() {
        b = new Book(author: 'Scott Davis', pages: 250, title: 'Groovy Recipes')
    }

    Publisher makePublisher() {
        // notice publisher defined in java does not have a parameter constructor, yet we are able to call
        // named constructor
        publisher = new Publisher(name: 'Pragmatic Bookshelf')
    }

    static void main(String[] args) {
        BookstoreGroovy bookstoreGroovy = new BookstoreGroovy()
        bookstoreGroovy.makePublisher()
        // notice we have not defined setName method on publisher class defined in java, yet we are able to call
        // getter
        println bookstoreGroovy.publisher.name

    }
}
