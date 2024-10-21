package tn.esprit.gestionzoo.entities;


public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" + super.toString() + ", nbrLegs=" + nbrLegs + "}";
    }
}
