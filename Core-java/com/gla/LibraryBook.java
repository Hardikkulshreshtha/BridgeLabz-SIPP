package com.gla;
public class LibraryBook {
    static class Book {
        static String libraryName = "GLA Library";
        final String isbn;
        String title;
        String author;
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
        public void displayDetails() {
            if (this instanceof Book) {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("ISBN: " + isbn);
                System.out.println("Library: " + libraryName);
            }
        }
        public static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }
    }
    public static void main(String[] args) {
        Book b = new Book("Java", "John", "111");
        if (b instanceof Book) {
            b.displayDetails();
        }
        Book.displayLibraryName();
    }
} 