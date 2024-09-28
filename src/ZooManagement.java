public class ZooManagement {


    public static void main(String []  args){

        //instanciation animal
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        //instanciation Zoo

        Zoo myZoo =new Zoo();
        myZoo.name=("Blvdr");
        myZoo.city=("Ariena");

        //   myZoo.animals = new Animal[25];
        System.out.println(lion);
        //system.out.println(lion.toString());
        myZoo.displayZoo();

        Animal tiger = new Animal("sam","yes",8,true);
        System.out.println(myZoo.addAnimal(tiger));
        Animal elephant=new Animal("elphnt","elphntt",6,true);
        System.out.println(myZoo.addAnimal(elephant));


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
        Z2.name = "lol park";
        Z2.city = "tunis";

        Z2.animals = new Animal[30];
        Zoo Z = new Zoo();
        Z = Zoo.comparerZoo(myZoo, Z2);
        System.out.println("le zoo ayant le plus d'animaux :" + Z.name);
        ;
    }
}
