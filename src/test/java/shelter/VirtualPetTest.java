package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("name1", "description", 80, 100, 100);
        pet2 = new VirtualPet("name2", "description", 80, 100, 100);

    }


    @Test
    public void shouldBeAbleToAddPet() {
        underTest.add(pet1);
        VirtualPet retrievePet = underTest.findPet("name1"); //name is the primary key
        assertEquals(retrievePet, pet1);

    }


    @Test
    public void shouldBeAbleToAddTwoPets() {
        underTest.add(pet1);
        underTest.add(pet2);
        Collection<VirtualPet> allPets = underTest.getAllPets(); //define the collection in our database, collection will look for the object you want to bring back.
        assertEquals(2, allPets.size());
    }

    @Test
    public void shouldBeAbleToRemoveAPet() {
        underTest.add(pet1);
        underTest.remove(pet1);
        VirtualPet retrievePet = underTest.findPet("name");
        assertEquals(retrievePet, null);

    }


}












