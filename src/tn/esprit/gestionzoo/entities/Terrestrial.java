package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public Terrestrial(String family, String name, int age, int nbrLegs) {
        super(family, name, age, true);
        this.nbrLegs = nbrLegs;
    }

}
