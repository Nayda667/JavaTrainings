package com.github.nayda667.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
        System.out.println("book is add "+book.getName());
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public Book findBook(String name) {
        Book books = null;
        for (Book book : library) {
            if (book.getName().contains(name)) {
                books = book;
            }
        }
        return books;
    }

    public Reader findReader(String name) {
        Reader readers1 = null;
        for (Reader readers : readers) {
            if (readers.getName().equals(name)) {
                readers1 = readers;
            }
        }
        return readers1;
    }



    public void printReport() {
        for (Book book1 : library) {
            String bookName = book1.getName();
            if (book1.isOnHands()) {
                for (Reader reader : readers) {
                    for (Book book : reader.getBooks()) {
                        if (book.getName().equals(bookName)) {
                            String readerName = reader.getName();
                            System.out.println(bookName+" "+readerName);
                        }
                    }
                }
            } else {
                System.out.println(bookName+", book in library");
            }
        }
    }

    public List<Book> getBooksByReaderName(String reader){
        return findReader(reader).getBooks();
    }
    public Reader findReaderByBookName(String bookName) {
        for (Reader reader :readers) {
            for (Book book : reader.getBooks()) {
                if (book.getName().equals(bookName)) {
                    return  reader;
                }
            }
        }
        return null;
    }
    public List<Book> getLibrary() {
        return library;
    }

    public List<Reader> getReaders() {
        return readers;
    }


}
