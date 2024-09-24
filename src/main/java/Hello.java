public class Hello {
    public static void main(String[] args) {

        // first Java program!
        System.out.println("new dawn, new day");

        String h = "Halloween";

        Random random = new Random();

        int r = random.nextInt(h.length());

        h.length(8);
        h.charAt(h.length -1);

        String s = "stimky";
        String k = s.substring(3);
        System.out.println(k);
    }
}