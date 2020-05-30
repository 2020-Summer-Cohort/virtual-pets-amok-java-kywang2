package pets_amok;

import java.util.ArrayList;
import java.util.Random;

public class VirtualPetShelter {
    static Random rand = new Random();
    public static ArrayList<VirtualPet> petArrayList = new ArrayList<VirtualPet>();

    public static void generatePets() {
        VirtualPet pet1 = new Cat(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                "Kyle the Cat", "Sweet, Sly, Smooth", rand.nextInt(10),
                rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
        VirtualPet pet2 = new Dog(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                "Dusty the Dog", "Fluffy, Furry, Flamboyant", rand.nextInt(10),
                rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
        VirtualPet pet3 = new RoboticDog(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                "Ricky the Robotic Dog", "Cool, Calm, Cunning", rand.nextInt(10));
        VirtualPet pet4 = new RoboticCat(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                "Ronnie the Robotic Cat", "Talkative, Territorial, Tame", rand.nextInt(10));
        petArrayList.add(pet1);
        petArrayList.add(pet2);
        petArrayList.add(pet3);
        petArrayList.add(pet4);
    }

    public static void showPets() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Natural) {
                System.out.println("We have: " + petList.getName());
                System.out.println("Their description is: " + petList.getNameDescription());
                System.out.println("Their boredom level is: " + petList.getBoredomLevel());
                System.out.println("Their tiredness level is: " + petList.getTirednessLevel());
                System.out.println("Their overall health level is: " + petList.getOverallHealth());
                System.out.println("Their hunger level is: " + ((Natural) petList).getHungerLevel());
                System.out.println("Their thirst level is: " + ((Natural) petList).getThirstLevel());
                System.out.println("Their waste level is: " + ((Natural) petList).getWasteLevel());
            }
            if (petList instanceof Cat) {
                System.out.println("Their litter box cleanliness level is: " + ((Cat) petList).getLitterBoxCleanliness());
            }
            if (petList instanceof Dog) {
                System.out.println("Their cage cleanliness level is: " + ((Dog) petList).getCageCleanlinessLevel());
            }
            if (petList instanceof Robotic) {
                System.out.println("We have: " + petList.getName());
                System.out.println("Their description is: " + petList.getNameDescription());
                System.out.println("Their boredom level is: " + petList.getBoredomLevel());
                System.out.println("Their tiredness level is: " + petList.getTirednessLevel());
                System.out.println("Their oil level is: " + ((Robotic) petList).getOilLevel());
                System.out.println("Their overall health level is: " + petList.getOverallHealth());
            }
        }
    }

    public static void petNames() {
        for (VirtualPet petList : petArrayList) {
            System.out.println("We have: " + petList.getName());
        }
    }

    public static void naturalPetNames() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Natural) {
                System.out.println("We have: " + petList.getName());
            }
        }
    }

    public static void roboticPetNames() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Robotic) {
                System.out.println("We have: " + petList.getName());
            }
        }
    }

    public static void gamePlay() {
        while (true) {
            for (int i = 0; i < petArrayList.size(); i++) {
                if ((petArrayList.get(i).getOverallHealth() < 15)) {
                    Application.whatActivity();
                }
            }
            gameOver();
        }
    }

    public static void gameOver() {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getOverallHealth() >= 15) {
                System.out.println(petArrayList.get(i).getName() + " had too low of health and ran away.  You lose. Game Over!");
                System.exit(0);
            }
        }
    }


    public static void adoptPet(String name) {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getName().equals(name)) {
                System.out.println("You chose to adopt: " + petArrayList.get(i).getName());
                System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
                petArrayList.remove(i);
            }
        }
    }

    public static void adoptPet() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.remove(i);
        }
    }

    public static void intakePet(VirtualPet pet) {
        petArrayList.add(pet);
    }

    public static void feedPet(String name) {
        for (VirtualPet petList : petArrayList) {
            if (petList.getName().equals(name)) {
                if (petList instanceof Natural) {
                    System.out.println("You chose to feed: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((Natural) petList).feed();
                }
                if (petList instanceof Robotic) {
                    System.out.println("You cannot feed a robotic animal. Please choose another option.");
                }
            }
        }
    }

    public static void feedPet() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Natural) {
                ((Natural) petList).feed();
            }
        }
    }

    public static void waterPet(String name) {
        for (VirtualPet petList : petArrayList) {
            if (petList.getName().equals(name)) {
                if (petList instanceof Natural) {
                    System.out.println("You chose to give water to: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((Natural) petList).water();
                }
                if (petList instanceof Robotic) {
                    System.out.println("You cannot give water to a robotic animal. Please choose another option.");
                }
            }
        }
    }

    public static void waterPet() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Natural) {
                ((Natural) petList).water();
            }
        }
    }

    public static void oilPet(String name) {
        for (VirtualPet petList : petArrayList) {
            if (petList.getName().equals(name)) {
                if (petList instanceof Natural) {
                    System.out.println("You cannot give oil to a natural animal. Please choose another option.");
                }
                if (petList instanceof Robotic) {
                    System.out.println("You chose to give oil to: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((Robotic) petList).oiling();
                }
            }
        }
    }

    public static void oilPet() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Robotic) {
                ((Robotic) petList).oiling();
            }
        }
    }

    public static void walkPet(String name) {
        for (VirtualPet petList : petArrayList) {
            if (petList.getName().equals(name)) {
                if (petList instanceof Cat) {
                    System.out.println("You chose to let out: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((Cat) petList).letOut();
                }
                if (petList instanceof Dog) {
                    System.out.println("You chose to walk: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((Dog) petList).walk();
                }
                if (petList instanceof RoboticCat) {
                    System.out.println("You chose to let out: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((RoboticCat) petList).letOut();
                }
                if (petList instanceof RoboticDog) {
                    System.out.println("You chose to walk: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((RoboticDog) petList).walk();
                }
            }
        }
    }

    public static void walkPet() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Cat) {
                ((Cat) petList).letOut();
            }
            if (petList instanceof Dog) {
                ((Dog) petList).walk();
            }
            if (petList instanceof RoboticCat) {
                ((RoboticCat) petList).letOut();
            }
            if (petList instanceof RoboticDog) {
                ((RoboticDog) petList).walk();
            }
        }
    }

    public static void cleanPet(String name) {
        for (VirtualPet petList : petArrayList) {
            if (petList.getName().equals(name)) {
                if (petList instanceof Natural) {
                    System.out.println("You chose to clean the cage of: " + petList.getName());
                    System.out.println("Their description is: " + petList.getNameDescription());
                    ((Natural) petList).cleanCage();
                }
                if (petList instanceof Robotic) {
                    System.out.println("Robotic animals do not have cages to clean. Please choose another option.");
                }
            }
        }
    }

    public static void cleanPet() {
        for (VirtualPet petList : petArrayList) {
            if (petList instanceof Natural) {
                ((Natural) petList).cleanCage();
            }
        }
    }

    public static void playPet(String name) {
        for (int i = 0; i < petArrayList.size(); i++) {
            if (petArrayList.get(i).getName().equals(name)) {
                System.out.println("You chose to play with: " + petArrayList.get(i).getName());
                System.out.println("Their description is: " + petArrayList.get(i).getNameDescription());
                petArrayList.get(i).play();
            }
        }
    }

    public static void playPet() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).play();
        }
    }

    public static void letAnimalSleep() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).sleep();
        }
    }

    public static void tick() {
        for (int i = 0; i < petArrayList.size(); i++) {
            petArrayList.get(i).tick();
        }
    }

}
