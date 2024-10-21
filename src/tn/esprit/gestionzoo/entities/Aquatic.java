package tn.esprit.gestionzoo.entities;


public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + habitat.hashCode();
        return result;
    }
}

