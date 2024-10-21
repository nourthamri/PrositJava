package tn.esprit.gestionzoo.entities;


import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public boolean addAnimal(Animal animal) {
        return animals.add(animal);
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof Dolphin) {
                dolphinCount++;
            } else if (animal instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
}
