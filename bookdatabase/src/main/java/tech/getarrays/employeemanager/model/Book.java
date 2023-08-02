package tech.getarrays.employeemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String author;
    private String isbn;
    private String title;
    private String year;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String bookCode;

    public Book() {}

    public Book(String author, String isbn, String title, String year, String imageUrl, String bookCode) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.imageUrl = imageUrl;
        this.bookCode = bookCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}