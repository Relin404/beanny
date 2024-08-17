package com.relin.beanny.dao;

import com.relin.beanny.domain.Author;

import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long id);
}
