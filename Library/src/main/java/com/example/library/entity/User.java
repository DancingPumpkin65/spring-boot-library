package com.example.library.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userID;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_address")
    private String userAddress;

    @Column(name="phone_no")
    private String phoneNo;

    @ManyToOne
    @JoinColumn(name="librarian_id")
    private Librarian librarian;

    @OneToMany(mappedBy="borrower", cascade=CascadeType.ALL)
    private List<Book> books;

    // getters & setters
    public Integer getUserID() { return userID; }
    public void setUserID(Integer userID) { this.userID = userID; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getUserAddress() { return userAddress; }
    public void setUserAddress(String userAddress) { this.userAddress = userAddress; }
    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public Librarian getLibrarian() { return librarian; }
    public void setLibrarian(Librarian librarian) { this.librarian = librarian; }
    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }

    public void returnBooks() {
    }
    public int payFine(Date dt) {
        return 0;
    }
    public void addNewUser() {
    }
    public void deleteUser() {
    }
    public void updateDetails() {
    }
    public void bookPurchase() {
    }
}
