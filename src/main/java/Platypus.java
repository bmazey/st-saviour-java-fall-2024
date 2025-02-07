public class Platypus extends Mammal {
   
    public int eggs;

    public Platypus(String name, String species, String hairColor, int eggs) {
        super(name, species, hairColor);
        this.eggs = eggs;
    }

    public void layEgg() {
        this.eggs++;
    }
}
