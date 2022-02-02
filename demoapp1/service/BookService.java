package com.dxc.demoapp1.service;

import com.dxc.demoapp1.model.Book;

import java.util.List;

public interface BookService {
    public Book getBookId(int id);

    public Book getBookname(String title);

    public Book getBookemail(String isbn);

    public Book createBook(Book book);

    public Book updateBook(int id);

    public void deleteBook(int id);

    public List<Book> getAllBook();
}


