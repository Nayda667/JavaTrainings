package com.github.nayda667.model;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private  List<Book> books = new ArrayList<>();

    public Reader(String name) {
        this.name = name;
    }

    public  void addBookToReader(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                '}';
    }
}

