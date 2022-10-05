package com.zookeper.hoxtonjavazookeper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooAnimalController {
    @Autowired
    private ZooAnimalRepository zooAnimalRepository;

    @GetMapping("/animals")
    public List<ZooAnimal> getZooAnimals() {
        return zooAnimalRepository.findAll();
    }

    @PostMapping("/animals")
    public ZooAnimal addZooAnimal(ZooAnimal zooAnimal) {
        return zooAnimalRepository.save(zooAnimal);
    }

    @DeleteMapping("/animals/{id}")
    public String deleteZooAnimal(Integer id) {
        zooAnimalRepository.deleteById(id);
        return "Animal deleted succesfully";
    }

    @PatchMapping("/animals/{id}")
    public ZooAnimal updateZooAnimal(@RequestBody ZooAnimal zooAnimal, @PathVariable Integer id) {
        zooAnimal.id = id;
        return zooAnimalRepository.save(zooAnimal);
    }
}

interface ZooAnimalRepository extends JpaRepository<ZooAnimal, Integer> {
}
