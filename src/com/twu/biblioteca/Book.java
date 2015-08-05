package com.twu.biblioteca;

/**
 * Created by Robert on 29/07/15.
 */
public class Book {
    public final static String BOOK_FORMAT = "|%1$-25s|%2$-25s|%3$-25s|\n";
    private String author;
    private String name;
    private String yearPublished;
    public boolean availability;


    public Book(String name){
        this(name, "Unknown");
    }

    public Book(String name, String author){
        this(name, author, "Unknown");
    }

    public Book(String name, String author, String yearPublished){
        this.name = name;
        this.availability = true;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    public String getName() {
        return name;
    }

    public boolean setAvailability(boolean availability) {
        this.availability = availability;
        return availability;
    }

    public boolean getAvailability() {
        return availability;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearPublished(){
        return yearPublished;
    }

    public String toString(){
        return String.format(Book.BOOK_FORMAT, this.getName(), this.getAuthor(), this.getYearPublished());
    }
}
