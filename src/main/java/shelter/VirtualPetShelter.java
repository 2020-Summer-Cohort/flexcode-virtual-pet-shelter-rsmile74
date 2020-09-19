package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>(); //hashmap array /ordered collection, store the key values.

    public void add(VirtualPet newPetToAdd) {
        pets.put(newPetToAdd.getShelterPet(), newPetToAdd);


    }

    public VirtualPet findPet(String petname) {
        return pets.get(petname);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values(); //values is associated with collections
    }

    public void remove(VirtualPet newPetToRemove) {
        pets.remove(newPetToRemove.getShelterPet(), newPetToRemove);
    }

    public void showAllPets() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(pet.getname() + pet.getDescription() + pet.getHunger() + pet.getThirst() + pet.getBoredom());
        }
    }




    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }


    }

    public void drinkWater() {
        for (VirtualPet pet : pets.values()) {
            pet.thirst();
        }
    }

    public void boredPet() {
        for (VirtualPet pet : pets.values()) {
            pet.boredom();
        }
    }


}

