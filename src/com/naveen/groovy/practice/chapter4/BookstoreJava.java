package com.naveen.groovy.practice.chapter4;

public class BookstoreJava implements Bookstore {
    private Book b; // written in Groovy
    private Publisher p; // written in Java
    public Book makeBook() {
        b = new Book();
        b.setAuthor("Scott Davis" );
        b.setTitle("Groovy Recipes" );
        b.setPages(250);
        return b;
    }
    public Publisher makePublisher() {
        p = new Publisher();
       // p.setName("Pragmatic Bookshelf" );
        return p;
    }
}
