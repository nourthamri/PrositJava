package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


import java.util.Scanner;

class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);


        zoo.addAnimal(new Dolphin("Flipper", 5, "Océan", 25.0f));
        zoo.addAnimal(new Penguin("Pingu", 3, "Antarctique", 20.0f));
        zoo.addAnimal(new Terrestrial("Lion", 4, 4));


        zoo.displayNumberOfAquaticsByType();



        scanner.close();
    }
}


