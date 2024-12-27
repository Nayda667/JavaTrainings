package com.github.nayda667.service;

import com.github.nayda667.model.Book;
import com.github.nayda667.model.Library;
import com.github.nayda667.model.Reader;

import java.util.List;

public class BookService {
    private final Library library;

    public BookService(Library library) {
        this.library = library;
    }

    public void giveBookToReader(String bookTitle, String readerName) {
        Reader reader = library.findReader(readerName);
        Book book = library.findBook(bookTitle);
        if (book != null && !book.isOnHands()) {
            reader.addBookToReader(book);
            book.setOnHands(true);
        } else {
            System.out.println("book is not available");
        }
    }

    public void returnBookFromReader(String bookTitle, String readerName) {
        Book book0 = library.findBook(bookTitle);
        if (book0.isOnHands()) {
            Reader reader = library.findReader(readerName);
            Book book = library.findBook(bookTitle);
            reader.getBooks().remove(book);
            book.setOnHands(false);
        }
    }

    public List<Book> getBooksByReaderName(String name) {
        return library.getBooksByReaderName(name);
    }
    public Reader findReaderByBookName(String bookName) {
        return library.findReaderByBookName(bookName);
    }
    public void printReport(){
        library.printReport();
    }
}
