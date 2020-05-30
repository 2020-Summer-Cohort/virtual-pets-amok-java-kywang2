package pets_amok;

public abstract class VirtualPet {
    protected int boredomLevel;
    protected int tirednessLevel;
    protected int overallHealth;
    private String animalName;
    private String animalDescription;

    public VirtualPet(int boredomLevel, int tirednessLevel, int overallHealth, String animalName, String animalDescription) {
        this.boredomLevel = boredomLevel;
        this.tirednessLevel = tirednessLevel;
        this.overallHealth = overallHealth;
        this.animalName = animalName;
        this.animalDescription = animalDescription;
    }

    public abstract void play();

    public abstract void sleep();

    public abstract void tick();

    public abstract void walk();

    int getBoredomLevel() {
        return boredomLevel;
    }

    int getTirednessLevel() {
        return tirednessLevel;
    }

    int getOverallHealth() {
        return overallHealth;
    }

    String getName() {
        return animalName;
    }

    String getNameDescription() {
        return animalDescription;
    }

}
