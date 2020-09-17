package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        VirtualPet petname = new VirtualPet("name", "description", 80, 75, 100);

        System.out.println("Thank you for volunteering at Rhonda's Virtual Pet Shelter and Delicatessen");
        System.out.println("This is the status of your pets");
        petname.tick();
        System.out.println("Name   | Hunger   | Boredom | Thirst ");
        System.out.println("-------|----------|---------|---------");
        System.out.println("Brutus    " + "|" + petname.getHunger() + "        " + "|" + petname.getBoredom() + "      " + "|" + petname.getThirst());
        petname.tick();
        System.out.println("Ms.Kitty  " + "|" + petname.getHunger() + "        " + "|" + petname.getBoredom() + "      " + "|" + petname.getThirst());
        petname.tick();
        System.out.println("Spike     " + "|" + petname.getHunger() + "        " + "|" + petname.getBoredom() + "      " + "|" + petname.getThirst());


        System.out.println("What would you like to to next?");
        System.out.println("Would you like to play with a pet or adopt a pet, or place a pet in our shelter Please choose one");


        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");
        String UserEntered = input.nextLine();


        System.out.println("Please pick the pet you like");
        while (!UserEntered.equals("6")) {
            if (UserEntered.equals("1")) {
                petname.feed();
                String name = input.nextLine();
                System.out.println(name + " gets very hungry when he plays alot so make sure you have that food ready!!!");

            } else if (UserEntered.equals("2")) {
                petname.thirst();
                String name = input.nextLine();
                System.out.println(name + " This pet loves eating it's favorite dry food, but tends to get extremely thirsty make sure you have water ready.");

            } else if (UserEntered.equals("3")) {
                petname.boredom();
                String name = input.nextLine();
                System.out.println(name + " can get easily get bored, playtime is this pet favourite thing, so if you are active then this is the pet for you");

            } else if (UserEntered.equals("4")) {
                petname.getDescription();
                input.nextLine();
                System.out.println("Please tell us which pet you wan to Adopt and please give a description.");
                input.nextLine();
                System.out.println("that is a great choice!!!");

            } else if (UserEntered.equals("5")) {
            System.out.println("Would you like to admit a pet " + newPetToAdd.getShelterPet(petname) );
            input.nextLine();
            System.out.println("that is a great choice!!!");
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


