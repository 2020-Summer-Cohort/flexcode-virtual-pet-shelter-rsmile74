package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void shouldBeAbleToFeedPet() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getHunger();
        assertEquals(80, result);

    }
    @Test
    public void shouldBeAbleToDrinkWater() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getThirst();
        assertEquals(100, result);
    }

    @Test
    public void shouldBeAbleToGetBored(){
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getBoredom();
        assertEquals(100, result);
    }


    @Test
    public void shouldBeAbletoAddDescription() {
        VirtualPet underTest = new VirtualPet("name", "description", 80, 100, 100);
        String result = underTest.getDescription();
        assertEquals("description", result);

    }
}
