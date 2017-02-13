package ua.home.dao.entities;

import javax.persistence.*;

/**
 * Created by xnx_ on 05.02.2017.
 */
@Entity
@Table(name="addresses")
public class Addresses {


    @Id
    @Column(name="id")
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="houseNumber")
    private String houseNumber;

    @Column(name="flatNumber")
    private String flatNumber;


    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "streets_id", referencedColumnName = "id", nullable = false)
    private Streets streets;

    public Addresses() {
        this.id = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Streets getStreets() {
        return streets;
    }

    public void setStreets(Streets streets) {
        this.streets = streets;
    }
}
