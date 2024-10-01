package tn.esprit.gestionzoo.main;

import tn.esprit.espritzoo.entities.Animal;
import tn.esprit.espritzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setNom("Blvdr");
        myZoo.setCity("Ariena");

        System.out.println(lion);
        myZoo.displayZoo();

        Animal tiger = new Animal("sam", "yes", 8, true);
        System.out.println(myZoo.addAnimal(tiger));
        Animal elephant = new Animal("elphnt", "elphntt", 6, true);
        System.out.println(myZoo.addAnimal(elephant));

        Animal ours = new Animal("ours", "ours", 8, true);
        System.out.println(myZoo.addAnimal(ours));

        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(tiger));
        System.out.println(myZoo.searchAnimal(elephant));

        Animal chien = new Animal("chien", "bob", 5, true);
        System.out.println(myZoo.addAnimal(chien));
        System.out.println(myZoo.searchAnimal(chien));
        System.out.println(myZoo.removeAnimal(chien));
        myZoo.displayAnimals();

        if (myZoo.isZooFull()) {
            System.out.println("zoo est plein");
        } else {
            System.out.println("il y a encore de place");
        }

        Zoo Z2 = new Zoo();
        Z2.setNom("park");
        Z2.setCity("tunis");

        Animal[] animals2 = new Animal[30];
        Z2.setAnimals(animals2); // Cela doit fonctionner maintenant
        Zoo Z = Zoo.comparerZoo(myZoo, Z2);
        System.out.println("le zoo ayant le plus d'animaux :" + Z.getNom());
    }
}
