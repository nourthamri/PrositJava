package tn.esprit.espritzoo.entities;
import tn.esprit.gestionzoo.main.ZooManagement;
import tn.esprit.gestionzoo.main.ZooManagement;


public class Animal {

    //instruction18
    private String family, name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age négatif !!");
        }
    }

    public boolean isMammal() {
        return this.isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


    public Animal()
    {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        //18
        setAge(age);
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.espritzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
