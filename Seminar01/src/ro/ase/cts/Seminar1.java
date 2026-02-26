package ro.ase.cts;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.ZooKeeper;

public class Seminar1 {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper(
                "Popescu"
        );
        ZOO zoo = new ZOO("Baneasa",keeper);
        zoo.addAnimal(new Lion("Leul",10,"carne",100));
        zoo.addAnimal(new Zebra("Zebra",10,"fan",80));
        zoo.addAnimal(new Zebra("Zebra",8,"iarba",180));
        zoo.addAnimal(new Lion("Leul",9,"carne",100));

        zoo.feedAllAnimals();
    }
}
