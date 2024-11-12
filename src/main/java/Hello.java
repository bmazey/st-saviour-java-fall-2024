public class Hello {
    public static void main(String[] args) {
        Platypus Perry = new Platypus();
        // Perry is the name of the instance, not the name property 
        // Platypus() is the constuctor method that was defined within the Platypus class 
        System.out.println(Perry.aquatic); 
        System.out.println(Perry.legs);
        Perry.swim();
        System.out.println(Perry.aquatic);
        // True now
        System.out.println(Perry.eggs); 
        // Prints 0, default value is 0
        Perry.layEgg();
        System.out.println(Perry.eggs);
        // Prints 1
        Perry.layEgg();
        System.out.println(Perry.eggs);
        // Prints 2
    }
}