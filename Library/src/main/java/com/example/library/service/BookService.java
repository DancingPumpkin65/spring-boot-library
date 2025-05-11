package com.example.library.service;

import com.example.library.entity.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(int id);
    Book save(Book book);
    void delete(int id);
    List<Book> inquiryByName(String name);
}
