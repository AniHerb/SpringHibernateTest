package ua.home.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xnx_ on 10.02.2017.
 */
@Entity
@Table(name = "OperatonType")
public class OperatonType {
    @Id
    @Column (name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    public OperatonType() {
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
}
