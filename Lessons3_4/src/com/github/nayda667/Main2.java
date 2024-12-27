package com.github.nayda667;

import com.github.nayda667.model.Book;
import com.github.nayda667.model.Library;
import com.github.nayda667.model.Reader;
import com.github.nayda667.service.BookService;

public class Main2 {
    public static void main(String[] args) {
        Book book = new Book("The lord of the rings");
        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("OnePiece");
        Reader john = new Reader("Jone");
        Reader dave = new Reader("Dave");
        Library library = new Library();
        BookService bookService = new BookService(library);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addReader(john);
        library.addReader(dave);
        bookService.giveBookToReader(book.getName(), john.getName());
        bookService.giveBookToReader(book1.getName(), john.getName());
        bookService.giveBookToReader(book2.getName(), dave.getName());
        bookService.returnBookFromReader(book.getName(), john.getName());
        System.out.println(bookService.getBooksByReaderName(john.getName()));
        System.out.println(library.findReaderByBookName(book1.getName()));
        System.out.println();
        bookService.printReport();
    }
}
