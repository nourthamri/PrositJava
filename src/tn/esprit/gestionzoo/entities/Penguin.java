package tn.esprit.gestionzoo.entities;


public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" + super.toString() + ", swimmingDepth=" + swimmingDepth + "}";
    }
}


