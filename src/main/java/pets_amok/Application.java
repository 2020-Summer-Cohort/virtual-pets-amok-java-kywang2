package pets_amok;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Application {
    static VirtualPetShelter petShelter = new VirtualPetShelter();
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        welcomeNote();
        petShelter.generatePets();
        petShelter.showPets();
        gameLoop();
    }

    public static void whatActivity() {
        System.out.println("What do you want to do? Make sure every animal's overall health doesn't reach level 15!");
        System.out.println("1. Feed the Natural Pets.");
        System.out.println("2. Give the Natural Pets Water.");
        System.out.println("3. Play With a Pet.");
        System.out.println("4. Let Pets Sleep.");
        System.out.println("5. Give a Robotic Pet Oil.");
        System.out.println("6. Walk a Pet.");
        System.out.println("7. Clean the Cage of a Pet");
        System.out.println("8. Adopt a Pet.");
        System.out.println("9. Admit a Pet.");
        int myResponse = input.nextInt();
        input.nextLine();
        if (myResponse == 1) {
            feedAnimals();
        } else if (myResponse == 2) {
            waterAnimals();
        } else if (myResponse == 3) {
            playWithAnimals();
        } else if (myResponse == 4) {
            letAnimalsSleep();
        } else if (myResponse == 5) {
            oilAnimals();
        } else if (myResponse == 6) {
            walkAnimals();
        } else if (myResponse == 7) {
            cleanAnimals();
        } else if (myResponse == 8) {
            adoptAnimal();
        } else if (myResponse == 9) {
            admitAnimal();
        }
        petShelter.showPets();
        petShelter.tick();
    }

    public static void gameLoop() {
        petShelter.gamePlay();
    }

    public static void welcomeNote() {
        System.out.println("Hi, welcome to Kyle's adoption shelter.  We have an amazing variety of wonderful natural and robotic pets!  " +
                "This is our list of pets today:");
    }

    public static void playWithAnimals() {
        System.out.println("You chose to play with the pets. Which pet would you like to play with?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to play with all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to play with all the animals.");
            petShelter.playPet();
        } else {
            petShelter.playPet(myResponse);
        }
    }

    public static void feedAnimals() {
        System.out.println("You chose to feed the natural pets. Which pet would you like to feed?");
        petShelter.naturalPetNames();
        System.out.println("Enter the name of the pet or enter all to feed all natural pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to feed all the animals.");
            petShelter.feedPet();
        } else {
            petShelter.feedPet(myResponse);
        }
    }

    public static void waterAnimals() {
        System.out.println("You chose to give the natural pets water. Which pet would you like to give the water to?");
        petShelter.naturalPetNames();
        System.out.println("Enter the name of the pet or enter all to give all pets water: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to give all the animals water.");
            petShelter.waterPet();
        } else {
            petShelter.waterPet(myResponse);
        }
    }

    public static void letAnimalsSleep() {
        System.out.println("You chose to let the animals sleep");
        petShelter.letAnimalSleep();
    }

    public static void oilAnimals() {
        System.out.println("You chose to give the robotic pets oil. Which pet would you like to give the oil to?");
        petShelter.roboticPetNames();
        System.out.println("Enter the name of the pet or enter all to give all robotic pets oil: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to give all the robotic animals oil.");
            petShelter.oilPet();
        } else {
            petShelter.oilPet(myResponse);
        }
    }
    public static void walkAnimals() {
        System.out.println("You chose to walk the pets.  Which pet would you like to walk?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to walk all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to walk all the animals.");
            petShelter.walkPet();
        } else {
            petShelter.walkPet(myResponse);
        }
    }

    public static void cleanAnimals() {
        System.out.println("You chose to clean the cage of the natural pets.  Which pet cage would you like to clean?");
        petShelter.naturalPetNames();
        System.out.println("Enter the name of the pet or enter all to clean the cage of all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            System.out.println("You chose to clean the cage of all the natural animals.");
            petShelter.cleanPet();
        } else {
            petShelter.cleanPet(myResponse);
        }
    }

    public static void adoptAnimal() {
        System.out.println("You chose to adopt a pet. Which animal would you like to adopt?");
        petShelter.petNames();
        System.out.println("Enter the name of the pet or enter all to adopt all pets: ");
        String myResponse = input.nextLine();
        if (myResponse.toLowerCase() == "all") {
            petShelter.adoptPet();
        } else {
            System.out.println("You chose to adopt all the animals.");
            petShelter.adoptPet(myResponse);
        }
    }

    public static void admitAnimal() {
        System.out.println("You chose to admit a pet!");
        System.out.println("What is their name?");
        String admittedAnimalName = input.nextLine();
        System.out.println("How would you describe them (in 3 fun words)?");
        String admittedAnimalDescription = input.nextLine();
        System.out.println("What type of animal are they?");
        System.out.println("Your options are: Dog, Cat, Robotic Dog, Robotic Cat");
        String admittedAnimalType = input.nextLine();
        if (admittedAnimalType.equals("Dog")) {
            VirtualPet dog = new Dog(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                    admittedAnimalName, admittedAnimalDescription, rand.nextInt(10), rand.nextInt(10),
                    rand.nextInt(10), rand.nextInt(10));
            petShelter.intakePet(dog);
        } if (admittedAnimalType.equals("Cat")) {
            VirtualPet cat = new Cat(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                    admittedAnimalName, admittedAnimalDescription, rand.nextInt(10), rand.nextInt(10),
                    rand.nextInt(10), rand.nextInt(10));
            petShelter.intakePet(cat);
        } if (admittedAnimalType.equals("Robotic Cat")) {
            VirtualPet roboticCat = new RoboticCat(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                    admittedAnimalName, admittedAnimalDescription, rand.nextInt(10));
            petShelter.intakePet(roboticCat);
        } if (admittedAnimalType.equals("Robotic Dog")) {
            VirtualPet roboticDog = new RoboticDog(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10),
                    admittedAnimalName, admittedAnimalDescription, rand.nextInt(10));
            petShelter.intakePet(roboticDog);
    }
}
}