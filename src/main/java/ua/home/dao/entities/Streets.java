package ua.home.dao.entities;

import javax.persistence.*;

/**
 * Created by xnx_ on 04.02.2017.
 */
@Entity
@Table(name="streets")
public class Streets {

    @Id
    @Column(name="id")
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @OneToOne
    @JoinColumn(name = "cities_id", referencedColumnName = "id", nullable = false)
    private Cities city;

    public Streets() {
        this.id = System.currentTimeMillis();
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Streetss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Streets streets = (Streets) o;

        if (id != null ? !id.equals(streets.id) : streets.id != null) return false;
        if (name != null ? !name.equals(streets.name) : streets.name != null) return false;
        return city != null ? city.equals(streets.city) : streets.city == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
