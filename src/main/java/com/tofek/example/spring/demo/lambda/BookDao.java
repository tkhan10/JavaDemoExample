package com.tofek.example.spring.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Deep Work", "Cal waterman"));
        books.add(new Book(2, "Atomic Habits", "David Scheduer"));
        books.add(new Book(3, "Reason for love", "Andy Moore"));
        return books;
    }
}
