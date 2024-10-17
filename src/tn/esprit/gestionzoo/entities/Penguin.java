package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String name, String family, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin [name=" + getName() + ", age=" + getAge() + ", habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + "]";
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
