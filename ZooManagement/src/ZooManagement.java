
public class ZooManagement {

    public static void main(String[] args) {
        //prosit2 instruction5+6
        Animal lion = new Animal("lion","simba",5,true);
        Animal chien= new Animal("chien","bob",4,true);
        Zoo myZoo= new Zoo("blvdr", "Ariana", 25);

        //instruction8
        myZoo.displayZoo();

        System.out.println(myZoo);          // Affiche les informations du zoo en utilisant  toString()
        System.out.println(myZoo.toString());

        // Ajout d'un animal dans le zoo
        myZoo.animals[0] = lion; // Ajoute l'animal lion à la première position du tableau d'animaux du zoo
        myZoo.animals[1] = chien;

        // Affichage des informations de l'animal
        System.out.println(myZoo.animals[0]);
        System.out.println(myZoo.animals[0].toString());
        System.out.println(myZoo.animals[1]);
        System.out.println(myZoo.animals[1].toString());


//        lion.family = "lion";
//        lion.name = "Simba";
//        lion.age = 8;
//        lion.isMammal = true;
//
//        Zoo myZoo = new Zoo();
//        myZoo.name = "blvdr";
//        myZoo.city = "Ariana";
//        myZoo.nbrCages = 25;
//        myZoo.animals = new Animal[25];



    } }
