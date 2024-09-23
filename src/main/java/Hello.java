import java.util.Random;

public class Hello { 
    public static void main(String[] args) { 
        // Strings are complicated

        String h = "Halloween";

        Random random = new Random();

        int r = random.nextInt(h.length());

        // System.out.println("the random number is: " + r);
        // System.out.println("the random letter is: " + h.charAt(r));

        String s = "September";
        String k = s.substring(0, 5);
        System.out.println(k);
    }
}
// String e = new String(Character.toChars(0x1F43C));