package com.gla;
public class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void showDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java Basics", "John Doe");
        eb.showDetails();
        eb.setAuthor("Jane Smith");
        System.out.println("Author: " + eb.getAuthor());
    }
} 