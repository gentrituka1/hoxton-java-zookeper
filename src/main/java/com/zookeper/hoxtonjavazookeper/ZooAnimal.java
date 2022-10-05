package com.zookeper.hoxtonjavazookeper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zoo_animals")
public class ZooAnimal {
    @Id
    @GeneratedValue()
    public Integer id;
    public String name;
    public String species;
    public String origin;
    public Boolean isHungry;

    public ZooAnimal() {
        
    }

}

