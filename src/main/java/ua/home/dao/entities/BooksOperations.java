package ua.home.dao.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xnx_ on 10.02.2017.
 */

@Entity
@Table (name = "booksOperations")
public class BooksOperations {

    @Id
    @Column(name = "id")
    private Long id;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Column(name = "count")
    private Integer count;

    @OneToOne
    @JoinColumn(name = "operation_id", referencedColumnName = "id", nullable = false)
    private OperatonType operatonType;

    @Column(name = "date")
    private Date date;

    @OneToOne
    @JoinColumn(name = "books_id",referencedColumnName = "id",nullable = false)
    private Books books;

    @OneToOne
    @JoinColumn(name = "persons_id",referencedColumnName = "id",nullable = false)
    private Persons persons;

    public BooksOperations() {
        this.id = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OperatonType getOperatonType() {
        return operatonType;
    }

    public void setOperatonType(OperatonType operatonType) {
        this.operatonType = operatonType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Persons getPersons() {
        return persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }
}
