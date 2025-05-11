package com.example.library.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String address;
    private String phoneNo;

    @OneToMany(mappedBy="publisher", cascade=CascadeType.ALL)
    private List<Librarian> librarians;

    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public List<Librarian> getLibrarians() { return librarians; }
    public void setLibrarians(List<Librarian> librarians) { this.librarians = librarians; }

    public void addPub() {
    }
    public void modifyPub() {
    }
    public void deletePub() {
    }
    public void orderStatus() {
    }
}
