package com.example.library.service;

import com.example.library.entity.Librarian;
import com.example.library.repository.LibrarianRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibrarianServiceImpl implements LibrarianService {
    private final LibrarianRepository repo;
    public LibrarianServiceImpl(LibrarianRepository repo) { this.repo = repo; }

    @Override public List<Librarian> findAll() { return repo.findAll(); }
}
