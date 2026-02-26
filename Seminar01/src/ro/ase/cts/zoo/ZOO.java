package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public ZOO(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void feedAllAnimals(){
        for(Animal animal: animals){
            zooKeeper.feedAnimal(animal);
        }
    }
}
