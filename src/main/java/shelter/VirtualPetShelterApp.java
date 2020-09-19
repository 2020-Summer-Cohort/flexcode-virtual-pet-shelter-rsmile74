package shelter;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        VirtualPetShelter pets = new VirtualPetShelter();
        VirtualPet fido = new VirtualPet("fido   ", "playful doggy   ", rand.nextInt(80), rand.nextInt(75), rand.nextInt(100)); //fido is the object
        VirtualPet spike = new VirtualPet("spike   ", "eats alot    ", rand.nextInt(80), rand.nextInt(75), rand.nextInt(100));
        VirtualPet kitty = new VirtualPet("kitty   ", "loves family   ", rand.nextInt(80), rand.nextInt(75), rand.nextInt(100));
        VirtualPet skipper = new VirtualPet("skipper  ", "older doggy  ", rand.nextInt(80), rand.nextInt(75), rand.nextInt(100));

        pets.add(fido); //fido is the object
        pets.add(spike);
        pets.add(kitty);
        pets.add(skipper);


        System.out.println("Thank you for volunteering at Rhonda's Virtual Pet Shelter and Delicatessen.");
        System.out.println("This is the status of our pets today");

        System.out.println("Name   | Description  | Hunger  | Boredom |Thirst");
        System.out.println("-------|--------------|---------|---------|-------");
        pets.showAllPets();

        System.out.println("Would you like to play with a pet or adopt a pet, or place a pet in our shelter Please choose one.");


        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");
        String UserEntered = input.nextLine();


        while (!UserEntered.equals("6")) {
            if (UserEntered.equals("1")) {
                pets.feedAllPets(); //creating methods in VirtualPetShelter
                System.out.println("Glad you enjoy feeding the pets, you are a great help.");


            } else if (UserEntered.equals("2")) {
                pets.drinkWater();
                System.out.println("Thanks for giving our pets water they really need it after all the play time.");


            } else if (UserEntered.equals("3")) {
                pets.boredPet();
                System.out.println("Yes the pets can get very bored thank for playing with them");

            } else if (UserEntered.equals("4")) {
                System.out.println("Which pet would you like to adopt please enter the name press enter and give us a description.");
                String name = input.nextLine();
                System.out.println("Please give a description why you like this pet.");
                String description = input.nextLine();
                System.out.println("You picked a very nice pet");
                VirtualPet newPetToRemove = new VirtualPet(name, description, 80, 75, 100);
                pets.remove(newPetToRemove);


            } else if (UserEntered.equals("5")) {
                System.out.println("You like to admit a pet in our shelter?");
                System.out.println("Enter the pet you want to add to our shelter.");
                String name = input.nextLine();
                System.out.println("What is the description of your pet?");
                String description = input.nextLine();
                System.out.println("Thanks we will take very good care of this pet");
                VirtualPet newPetToAdd = new VirtualPet(name, description, 80, 75, 100);
                pets.add(newPetToAdd);


            }


            System.out.println("You can pick 1-5 again and type your pet that you want or pick 6 to quit.");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Quit");
            UserEntered = input.nextLine();
        }


    }

}


