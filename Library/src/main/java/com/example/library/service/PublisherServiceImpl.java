package com.example.library.service;

import com.example.library.entity.Publisher;
import com.example.library.repository.PublisherRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository repo;
    public PublisherServiceImpl(PublisherRepository repo) { this.repo = repo; }

    @Override public List<Publisher> findAll() { return repo.findAll(); }
    @Override public Optional<Publisher> findById(int id) { return repo.findById(id); }
    @Override public Publisher save(Publisher publisher) { return repo.save(publisher); }
    @Override public void delete(int id) { repo.deleteById(id); }
}
