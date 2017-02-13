package ua.home.dao.entities;

import javax.persistence.*;

/**
 * Created by xnx_ on 04.02.2017.
 */
@Entity
@Table(name="countries")
public class Countries {
    @Id
    @Column(name="id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;

    public Countries() {
        this.id = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
