package com.krishna.prep.oopbasics;

public class Book {
    private String title;
    private int pages;
    private static int bookCount = 0;
    private static final int LONG_BOOK_PAGES = 300;

    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
        bookCount++;
    }


    public String getTitle(){
        return title;
    }

    public boolean isLong(){
        return pages > LONG_BOOK_PAGES;
    }


    public static int getBookCount(){
        return bookCount;
    }

    public static boolean isValidPages(int pages){
        return pages>0;
    }

    public static void showTitle(Book book){
        System.out.println(book.getTitle());
    }

}
