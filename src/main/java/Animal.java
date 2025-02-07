
public class Animal {

    protected String name;
    public String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void eat(String food) {
        System.out.println(this.name + " the " + this.species + " eats " + food + "!");
    }

    // setter for name property
    public void setName(String name) {
        // this area for example ...
        this.name = name;
    }

    // getter for name property
    public String getName() {
        return this.name;
    }
}