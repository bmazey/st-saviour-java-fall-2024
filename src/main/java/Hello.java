public class Hello {
    public static void main(String[] args) {

        // first Java program!
        // System.out.println("halloween");
        String word = "halloween";
        String reverse = "";
        for (int i = 0; i < word.length(); i--){
            reverse += word.charAt(i);
        }

            System.out.println(reverse);
    }
}