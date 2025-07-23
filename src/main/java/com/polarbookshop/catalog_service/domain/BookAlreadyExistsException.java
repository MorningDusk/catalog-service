package com.polarbookshop.catalog_service.domain;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String message) {
        super("A book with ISBN " + message + " already exists");
    }
}
