package ua.home.dao.entities;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persons persons = (Persons) o;

        if ( id.equals(persons.id)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        result = 31 * result + (addresses != null ? addresses.hashCode() : 0);
        return result;
    }
}
