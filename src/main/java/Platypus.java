public class Platypus {
    public String name;
    public boolean aquatic;
    public int legs;
    public int eggs;

    // Constructor method
    // Allows you to create instances from classes
    public Platypus() {
        this.name = "Perry";
        this.aquatic = false;
        this.legs = 4;
        this.eggs = 0;
    }

    public Platypus(String name, boolean aquatic, int legs, int eggs) {
        // Creates a constructor that accepts four arguments instead of creating them individually
        this.name = name;
        this.aquatic = aquatic;
        this.legs = legs;
        this.eggs = eggs; 
    }

    public void swim() {
        this.aquatic = true;
        System.out.println(this.name + " swims!");
    }

    public void layEgg() {
        this.eggs += 1; 
    }
}
