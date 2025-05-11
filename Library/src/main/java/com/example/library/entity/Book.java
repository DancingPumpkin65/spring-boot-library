package com.example.library.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="book_id")
    private Integer bookId;

    @Column(name="book_name")
    private String bookName;

    @Column(name="book_author")
    private String bookAuthor;

    @Column(name="year_of_pub")
    private String yearOfPub;

    @Column(name="price")
    private Float price;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User borrower;

    @ManyToOne
    @JoinColumn(name="librarian_id", nullable=false)
    private Librarian librarian;

    // getters & setters
    public Integer getBookId() { return bookId; }
    public void setBookId(Integer bookId) { this.bookId = bookId; }
    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }
    public String getBookAuthor() { return bookAuthor; }
    public void setBookAuthor(String bookAuthor) { this.bookAuthor = bookAuthor; }
    public String getYearOfPub() { return yearOfPub; }
    public void setYearOfPub(String yearOfPub) { this.yearOfPub = yearOfPub; }
    public Float getPrice() { return price; }
    public void setPrice(Float price) { this.price = price; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public User getBorrower() { return borrower; }
    public void setBorrower(User borrower) { this.borrower = borrower; }
    public Librarian getLibrarian() { return librarian; }
    public void setLibrarian(Librarian librarian) { this.librarian = librarian; }

    public void addNewBooks() {
    }
    public void deleteBooks() {
    }
    public void displayBookDetails() {
    }
    public void inquiryBook() {
    }
}
