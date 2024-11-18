public class Platypus{
    public String name; 
    public boolean aquatic;
    public int legs;
    public int eggs;

    // constructor method.
    public Platypus(){
        this.name = "Perry";
        this.aquatic = false;
        this.legs = 4;
        this.eggs = 0;
    }

    public void swim(){
        this.aquatic = true;
        System.out.println(this.name + "swims!");
    }
}