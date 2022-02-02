package com.dxc.demoapp1.service;
import com.dxc.demoapp1.model.Author;

import java.util.List;

public interface AuthorService {

    public Author getAuthorId(int id);

    public Author getAuthorname(String name);

    public Author getAuthoremail(String email);

    public Author createAuthor(Author author);

    public Author updateAuthor(int id);

    public void deleteAuthor(int id);

    public List<Author> getAllAuthor();
}


    
}
