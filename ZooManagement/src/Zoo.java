import java.sql.SQLOutput;

public class Zoo {
    Animal[] animals;
    String name, city;
    int nbrCages;

    //int nbrAnimals;

    public Zoo() {
    }

    public Zoo( String name, String city, int nbrCages)
    {//, int nbrAnimals) {
        animals= new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        //this.nbrAnimals = nbrAnimals;
    }
    public void displayZoo(){
        System.out.println("Zoo Name:"+ name);
        System.out.println(" City :"+ city);
        System.out.println("Number of Cages:" + nbrCages);
    }


    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
