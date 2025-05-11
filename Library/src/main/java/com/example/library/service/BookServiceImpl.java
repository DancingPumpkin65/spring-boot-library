package com.example.library.service;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository repo;
    public BookServiceImpl(BookRepository repo) { this.repo = repo; }

    @Override public List<Book> findAll() { return repo.findAll(); }
    @Override public Optional<Book> findById(int id) { return repo.findById(id); }
    @Override public Book save(Book book) { return repo.save(book); }
    @Override public void delete(int id) { repo.deleteById(id); }
    @Override public List<Book> inquiryByName(String name) {
        return (name == null || name.isBlank())
            ? repo.findAll()
            : repo.findByBookNameContaining(name);
    }
}
