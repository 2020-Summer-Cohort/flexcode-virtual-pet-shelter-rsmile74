package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet newPetToAdd)
    {
        pets.put(newPetToAdd.getShelterPet(), newPetToAdd);

    }

    public VirtualPet findPet(String petname) {
        return pets.get(petname);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values(); //values is associated with collections
    }

    public void remove(VirtualPet petname) {
        pets.remove(petname.getShelterPet(), petname);
    }



}
