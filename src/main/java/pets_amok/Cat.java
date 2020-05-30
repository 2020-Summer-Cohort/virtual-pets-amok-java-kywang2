package pets_amok;

public class Cat extends VirtualPet implements Natural {
    private int hungerLevel;
    private int thirstLevel;
    private int wasteLevel;
    private int litterBoxCleanlinessLevel;

    public Cat(int boredomLevel, int tirednessLevel, int overallHealth, String animalName, String animalDescription, int hungerLevel,
               int thirstLevel, int wasteLevel, int litterBoxCleanlinessLevel) {
        super(boredomLevel, tirednessLevel, overallHealth, animalName, animalDescription);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.wasteLevel = wasteLevel;
        this.litterBoxCleanlinessLevel = litterBoxCleanlinessLevel;
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
        litterBoxCleanlinessLevel += 1;
        overallHealth -= 1;
    }

    @Override
    public void feed() {
        hungerLevel -= 1;
        overallHealth -= 1;
        wasteLevel += 1;
        litterBoxCleanlinessLevel += 1;
    }

    @Override
    public void water() {
        thirstLevel -= 1;
        overallHealth -= 1;
        wasteLevel += 1;
        litterBoxCleanlinessLevel += 1;
    }

    @Override
    public void walk() {
    }

    void letOut() {
        hungerLevel += 1;
        thirstLevel += 1;
        overallHealth -= 1;
        wasteLevel -= 1;
        boredomLevel -= 1;
    }

    @Override
    public void cleanCage() {
        litterBoxCleanlinessLevel -= 2;
        overallHealth -= 1;
    }

    @Override
    public void tick() {
        boredomLevel += 1;
        tirednessLevel += 1;
        hungerLevel += 1;
        thirstLevel += 1;
        wasteLevel += 1;
        litterBoxCleanlinessLevel += 1;
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

    int getLitterBoxCleanliness() {
        return litterBoxCleanlinessLevel;
    }
}