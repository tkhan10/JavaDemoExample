package com.tofek.example.spring.demo.lambda;

public class Book {
    private int bookId;
    private String name;
    private String auther;

    public Book(int bookId, String name, String auther) {
        this.bookId = bookId;
        this.name = name;
        this.auther = auther;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
