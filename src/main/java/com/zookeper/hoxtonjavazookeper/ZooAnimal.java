package com.zookeper.hoxtonjavazookeper;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ZooAnimal {
    @Id
    public Integer id;
    public String name;
    public String species;
    public String origin;
    public Boolean isHungry;

    public ZooAnimal(String name, String species, String origin, Boolean isHungry) {
        this.name = name;
        this.species = species;
        this.origin = origin;
        this.isHungry = isHungry;
    }
}
