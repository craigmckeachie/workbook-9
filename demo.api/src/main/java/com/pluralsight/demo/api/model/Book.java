package com.pluralsight.demo.api.model;

public class Book {
    private int bookId;
    private String title;
    private Author author;
    private String genre;
    private double price;

    public Book(int bookId, String title, Author author, String genre, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }
}
