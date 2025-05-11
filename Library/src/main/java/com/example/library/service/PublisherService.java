package com.example.library.service;

import com.example.library.entity.Publisher;
import java.util.List;
import java.util.Optional;

public interface PublisherService {
    List<Publisher> findAll();
    Optional<Publisher> findById(int id);
    Publisher save(Publisher publisher);
    void delete(int id);
}
