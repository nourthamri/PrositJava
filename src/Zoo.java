public class Zoo {
    Animal[] animals; // tableau d'animaux
    String name, city;
    //instruction14
    final int nbrCages = 25;
    int nbrAnimals = 0; // Initialisation à 0

    public Zoo() {
        //14
        animals = new Animal[nbrCages];
    }

    public Zoo(String name, String city) {
        //14
        this();
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name +
                ", City: " + city +
                ", N° Cages/Animals: " + nbrCages);
    }

    //instruction12
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false; // L'animal existe déjà
        }
        if (nbrAnimals >= nbrCages) {
            return false; // Zoo plein
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true; // Animal ajouté
    }

    //instruction11
    // Affichage des animaux du zoo
    void displayAnimals() {
        System.out.println("Les animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Recherche
    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name.equals(animals[i].name)) {
                return i;
            }
        }
        return index; //animal n'est pas trouvé
    }

    //insturction 13
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false; //n'existepas
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    boolean isZooFull() {
        if (nbrAnimals >= nbrCages) {
            return true; //zoo plein
        } else {
            return false;


        }
    }
    //instruction 16
    static Zoo comparerZoo(Zoo myZoo,Zoo Z2){
        if(myZoo.nbrAnimals> Z2.nbrAnimals)
            return myZoo;
        else
            return Z2;

    }
}
