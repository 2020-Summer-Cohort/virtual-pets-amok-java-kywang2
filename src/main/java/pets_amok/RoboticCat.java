package pets_amok;

public class RoboticCat extends VirtualPet implements Robotic {

    private int oilLevel;

    public RoboticCat(int boredomLevel, int tirednessLevel, int overallHealth, String animalName, String animalDescription, int oilLevel) {
        super(boredomLevel, tirednessLevel, overallHealth, animalName, animalDescription);
        this.oilLevel = oilLevel;
    }

    @Override
    public void play() {
        boredomLevel -= 1;
        tirednessLevel += 1;
        oilLevel += 1;
        overallHealth -= 1;
    }

    @Override
    public void sleep() {
        tirednessLevel -= 1;
        boredomLevel -= 1;
        oilLevel += 1;
        overallHealth -= 1;
    }

    @Override
    public void oiling() {
        oilLevel -= 1;
        overallHealth -= 1;
    }

    @Override
    public void walk() {
    }

    public void letOut() {
        boredomLevel -= 1;
        tirednessLevel += 1;
        oilLevel += 1;
        overallHealth -= 1;
    }

    @Override
    public void tick() {
        boredomLevel += 1;
        tirednessLevel += 1;
        oilLevel += 1;
        overallHealth += 1;
    }

    @Override
    public int getOilLevel() {
        return oilLevel;
    }
}