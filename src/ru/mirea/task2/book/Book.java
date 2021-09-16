package ru.mirea.task2.book;

public class Book {
    private String author;
    private String title;
    private int date;

    public Book(String author, String title, int date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public static void printInfo(Book book){
        System.out.println("Information about book\nAuthor: " + book.author + "\nTitle: " + book.title + "\nDate: " + book.date);
    }
}
