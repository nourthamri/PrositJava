package tn.esprit.espritzoo.entities;
import tn.esprit.gestionzoo.main.ZooManagement;
import tn.esprit.espritzoo.entities.Zoo;



public class Zoo {
    //18
    private Animal[] animals; // tableau d'animaux
   private String name, city;
    //instruction14
   private final int nbrCages = 25;
     private int nbrAnimals = 0;

    public Animal[] getAnimals() {
        return animals.clone(); //copie de tableau pour éviter la modification
    }


    public void setAnimals(Animal[] animals) {
        this.animals = animals;
        this.nbrAnimals=animals.length;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        if (name.isBlank()) {
            System.out.println("Le nom du zoo ne peut pas être vide !");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }




    public Zoo() {
        //14
        animals = new Animal[nbrCages];
    }

    public Zoo(String name, String city) {
        //14
        this();
        //18
        setNom(name) ;
        this.city = city;
    }

   public void displayZoo() {
        System.out.println("Name: " + name +
                ", City: " + city +
                ", N° Cages/Animals: " + nbrCages);
    }

    //instruction12
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false; // L'animal existe déjà
        }
        //instruction17
        if (isZooFull()) {
            return false; // tn.esprit.espritzoo.entities.Zoo plein
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true; // tn.esprit.espritzoo.entities.Animal ajouté
    }

    //instruction11
    // Affichage des animaux du zoo
    public void displayAnimals() {
        System.out.println("Les animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Recherche
   public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName().equals(animals[i].getName())) {
                return i;
            }
        }
        return index; //animal n'est pas trouvé
    }

    //insturction 13
    public boolean removeAnimal(Animal animal) {
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

     public boolean isZooFull() {
        if (nbrAnimals >= nbrCages) {
            return true; //zoo plein
        } else {
            return false;


        }
    }
    //instruction 16
    public static Zoo comparerZoo(Zoo myZoo,Zoo Z2){
        if(myZoo.nbrAnimals> Z2.nbrAnimals)
            return myZoo;
        else
            return Z2;

    }
}
