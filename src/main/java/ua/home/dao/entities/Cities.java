package ua.home.dao.entities;

import javax.persistence.*;

/**
 * Created by xnx_ on 04.02.2017.
 */
@Entity
@Table(name="cities")

public class Cities {
    @Id
    @Column(name="id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;
    @OneToOne
    @JoinColumn(name = "coutries_id", referencedColumnName = "id", nullable = false)
    private Countries country;

    public Cities() {
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

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cities cities = (Cities) o;

        if (id != null ? !id.equals(cities.id) : cities.id != null) return false;
        if (name != null ? !name.equals(cities.name) : cities.name != null) return false;
        return country != null ? country.equals(cities.country) : cities.country == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
