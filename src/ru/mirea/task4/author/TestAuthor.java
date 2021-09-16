package ru.mirea.task4.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Smith", "johnSmith@gmail.com", 'M');
        System.out.println(author.toString());
    }
}
