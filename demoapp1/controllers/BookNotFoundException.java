package com.dxc.demoapp1.controllers;

public class BookNotFoundException extends RuntimeException {
    BookNotFoundException(Integer id) {
        super("Could not find Book " + id);
    
}
}
