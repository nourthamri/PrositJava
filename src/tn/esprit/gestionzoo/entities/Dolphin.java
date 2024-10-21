package tn.esprit.gestionzoo.entities;


public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String name, int age, String habitat, float swimmingSpeed) {
        super(name, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" + super.toString() + ", swimmingSpeed=" + swimmingSpeed + "}";
    }
}
