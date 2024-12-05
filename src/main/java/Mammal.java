public class Mammal extends Animal {

    public String hairColor;
    public boolean warmBlooded = true;

    public Mammal(String name, String hairColor) {
        super(name);
        this.hairColor = hairColor;
    }
    
}
