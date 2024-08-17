package com.relin.beanny.dao;

import com.relin.beanny.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);
}
