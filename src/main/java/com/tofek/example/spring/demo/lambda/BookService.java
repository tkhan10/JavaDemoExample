package com.tofek.example.spring.demo.lambda;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    BookDao bookDao = new BookDao();
    public List<Book> getBooksOrderByName(){
        List<Book> books = bookDao.getBooks();
        Collections.sort(books,(o1,o2) -> o2.getName().compareTo(o1.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksOrderByName());
    }

}

// Option 2
/*Collections.sort(books, new Comparator<Book>() {
@Override
public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
        }
        });*/

// Option 1
/*class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}*/
