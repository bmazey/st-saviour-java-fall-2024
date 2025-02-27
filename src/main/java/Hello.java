
public class Hello {
    public static void main(String[] args) {

        // System.out.println(recombine("apple", "pear"));

        // String[] mixed = new String[]{"apple", "pear", "this", "cat"};
        // String[] result = mixedWords(mixed);
        // for(String s : result) {
        //     System.out.println(s);
        // }

        // int[] mountain = new int[]{11, 22, 33, 55, 77};
        // System.out.println(getPeakIndex(mountain));

        double[][] temps = new double[][]{
            {}
        };

    }

    // FRQ, Question 1 (a)
    // apple, pear -> apar
    // pear, apple -> peple
    private static String recombine(String word1, String word2) {
        return word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
    }

    // FRQ, Question 1 (b)
    // Precondition: array is even
    // {"apple", "pear", "this", "cat"} -> {"apar", "peple", "that", "cis"}
    private static String[] mixedWords(String[] words) {
        String[] result = new String[words.length];
        for(int i = 0; i < words.length; i += 2) {
            result[i] = recombine(words[i], words[i + 1]);
            result[i + 1] = recombine(words[i + 1], words[i]);
        }

        return result;
    }

    // FRQ, Question 2 (a)
    // Precondition: positives only, array.length > 0
    // {11, 22, 33, 22, 11} -> 2
    // {11, 22, 11, 22, 11} -> 1
    // {11, 22, 33, 55, 77} -> -1
    public static int getPeakIndex(int[] array) {
        for(int i = 1; i < array.length - 2; i++) {
            if(array[i - 1] < array[i] && array[i + 1] < array[i]) {
                return i;
            }
        }
        return -1;
    }

    // FRQ, Question 2 (b)
    // See AP Classroom

    // FRQ Question 3 (a)
    public static double computeTemp(double[][] temps, int i, int j) {
        if(i == 0 || j == 0 || i == temps.length - 1 || j == temps[i].length - 1) {
            return temps[i][j];
        }

        double center = temps[i][j];
        double above = temps[i - 1][j];
        double below = temps[i + 1][j];
        double left = temps[i][j - 1];
        double right = temps[i][j + 1];

        return (center + above + below + left + right) / 5;
       
    }
}