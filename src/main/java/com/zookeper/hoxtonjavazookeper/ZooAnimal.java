package com.zookeper.hoxtonjavazookeper;

public class ZooAnimal {
    private String name;
    private String species;
    private String origin;
    private Boolean isHungry;

    public ZooAnimal(String name, String species, String origin, Boolean isHungry) {
        this.name = name;
        this.species = species;
        this.origin = origin;
        this.isHungry = isHungry;
    }
}
