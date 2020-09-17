package shelter;

public class VirtualPet {
    private String petname;
    private String description;
    private int hunger = 80;
    private int thirst = 100;
    private int boredom = 100;

    public VirtualPet() {

    }


    public String getShelterPet() {
        return petname;

    }

    public String getDescription() {
        return description;
    }


    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }


    public VirtualPet(String petname, String description, int hunger, int thirst, int boredom) {
        this.petname = petname;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;


    }


    public void tick() {
        hunger++;
        thirst++;
        boredom++;
    }


    public void thirst() {
        thirst += 2;
    }

    public void boredom() {
        boredom += 3;
    }

    public void feed() {
        hunger -= 3;
    }


}
