package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 21
        Animal lion = new Animal("Simba", "Felidae", 8, true);

        // Instruction 20
        Zoo myZoo = new Zoo();
        myZoo.setNom("Blvdr");
        myZoo.setCity("Ariena");

        System.out.println(lion);
        myZoo.displayZoo();

        // Instruction 22
        Animal tiger = new Animal("Tiger", "Felidae", 8, true);
        System.out.println(myZoo.addAnimal(tiger));
        Animal elephant = new Animal("Elephant", "Elephantidae", 6, true);
        System.out.println(myZoo.addAnimal(elephant));

        Animal ours = new Animal("Ours", "Ursidae", 8, true);
        System.out.println(myZoo.addAnimal(ours));

        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(tiger));
        System.out.println(myZoo.searchAnimal(elephant));

        Animal chien = new Animal("Chien", "Canidae", 5, true);
        System.out.println(myZoo.addAnimal(chien));
        System.out.println(myZoo.searchAnimal(chien));
        System.out.println(myZoo.removeAnimal(chien));
        myZoo.displayAnimals();

        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Il y a encore de la place.");
        }

        Zoo Z2 = new Zoo();
        Z2.setNom("Park");
        Z2.setCity("Tunis");

        Animal[] animals2 = new Animal[30];
        Z2.setAnimals(animals2); // Cela doit fonctionner maintenant
        Zoo Z = Zoo.comparerZoo(myZoo, Z2);
        System.out.println("Le zoo ayant le plus d'animaux : " + Z.getNom());

        // Création des animaux
        // Instruction 20
        Aquatic aquatic = new Aquatic("Poisson", "Aquatic Family", 5, true, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Lion", "Terrestrial Family", 7, 4);
        Penguin penguin = new Penguin("Penguin", "Bird", 3, true, "Ocean", 30.0f);
        Dolphin dolphin = new Dolphin("Dolphin", "Cetacean", 5, true, "Ocean", 20.5f);

        // Instruction 23
        // Affichage des animaux
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
