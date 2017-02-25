package ua.home.dao.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by xnx_ on 05.02.2017.
 */
@Entity
@Table(name="persons")
public class Persons {
    @Id
    @Column(name="id")
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="fio")
    private String fio;

    @Column(name="identification",nullable = false)
    @NotNull
    private String identification;

    @OneToOne
    @JoinColumn(name="addresses_id")

    private Addresses addresses;

    public Persons() {
        this.id = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persons persons = (Persons) o;

        return identification.equals(persons.identification);
    }

    @Override
    public int hashCode() {
        return identification.hashCode();
    }
}
