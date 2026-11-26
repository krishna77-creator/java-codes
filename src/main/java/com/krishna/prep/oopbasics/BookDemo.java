package com.krishna.prep.oopbasics;

public class BookDemo {
    public static void main(String[] args) {
        Book b1= new Book("Harry Potter", 0);
        Book b2 = new Book("Bhagavath geetha", 500);
        Book b3 = new Book("Ramayan", 300);
        System.out.println(b1.getTitle());
        System.out.println(b1.isLong());

        System.out.println(b2.getTitle());
        System.out.println(b2.isLong());

        System.out.println(b3.getTitle());
        System.out.println(b3.isLong());

        System.out.println(Book.getBookCount());
        System.out.println(Book.isValidPages(0));

        Book.showTitle(b1);


    }
}
