
public class Mammal extends Animal {

    public boolean warmBlooded = true;
    public String hairColor;

    public Mammal(String name, String species, String hairColor) {
        super(name, species);
        this.hairColor = hairColor;
    }

    public void sleep() {
        System.out.println(this.name + " the " + this.hairColor + " " + this.species + " falls asleep ...");
    }

}
