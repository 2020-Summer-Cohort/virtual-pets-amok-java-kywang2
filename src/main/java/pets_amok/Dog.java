package pets_amok;

public class Dog extends VirtualPet implements Natural {
    private int hungerLevel;
    private int thirstLevel;
    private int wasteLevel;
    private int cageCleanlinessLevel;

    public Dog(int boredomLevel, int tirednessLevel, int overallHealth, String animalName, String animalDescription, int hungerLevel,
               int thirstLevel, int wasteLevel, int cageCleanlinessLevel) {
        super(boredomLevel, tirednessLevel, overallHealth, animalName, animalDescription);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.cageCleanlinessLevel = cageCleanlinessLevel;
    }

    @Override
    public void play() {
        boredomLevel -= 1;
        tirednessLevel += 1;
        hungerLevel += 1;
        thirstLevel += 1;
        wasteLevel += 1;
        overallHealth -= 1;
    }

    @Override
    public void sleep() {
        tirednessLevel -= 1;
        boredomLevel -= 1;
        hungerLevel += 1;
        thirstLevel += 1;
        wasteLevel += 1;
        cageCleanlinessLevel += 1;
        overallHealth -= 1;
    }

    @Override
    public void feed() {
        hungerLevel -= 1;
        overallHealth -= 1;
        wasteLevel += 1;
        cageCleanlinessLevel += 1;
    }

    @Override
    public void water() {
        thirstLevel -= 1;
        overallHealth -= 1;
        wasteLevel += 1;
        cageCleanlinessLevel += 1;
    }

    @Override
    public void walk() {
        hungerLevel += 1;
        thirstLevel += 1;
        overallHealth -= 1;
        wasteLevel -= 1;
        boredomLevel -= 1;
    }

    @Override
    public void cleanCage() {
        cageCleanlinessLevel -= 2;
        overallHealth -= 1;
    }

    @Override
    public void tick() {
        boredomLevel += 1;
        tirednessLevel += 1;
        hungerLevel += 1;
        thirstLevel += 1;
        wasteLevel += 1;
        cageCleanlinessLevel += 1;
        overallHealth += 1;
    }

    @Override
    public int getHungerLevel() {
        return hungerLevel;
    }

    @Override
    public int getThirstLevel() {
        return thirstLevel;
    }

    @Override
    public int getWasteLevel() {
        return wasteLevel;
    }

    int getCageCleanlinessLevel() {
        return cageCleanlinessLevel;
    }

}
