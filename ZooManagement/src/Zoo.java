public class Zoo {
    Animal[] animals;
    String name, city;
    int nbrCages;

    int nbrAnimals;

    public Zoo() {
    }

    public Zoo(Animal[] animals, String name, String city, int nbrCages, int nbrAnimals) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.nbrAnimals = nbrAnimals;
    }
}
