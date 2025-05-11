package com.example.library.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="librarians")
public class Librarian {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="publisher_id", nullable=false)
    private Publisher publisher;

    @OneToMany(mappedBy="librarian", cascade=CascadeType.ALL)
    private List<Book> books;

    @OneToMany(mappedBy="librarian", cascade=CascadeType.ALL)
    private List<User> users;

    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Publisher getPublisher() { return publisher; }
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }
    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users; }

    public List<Book> searchBook(String name) {
        return null;
    }
    public boolean verifyMember(int id) {
        return false;
    }
    public void orderBooks() {
    }
    public void sellBooks() {
    }
}
