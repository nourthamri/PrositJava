package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String name, String family, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(name, family, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin [name=" + getName() + ", age=" + getAge() + ", habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + "]";
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
