
public class Hello {
    public static void main(String[] args) {

        String[][] symbols = new String[11][11];

        for(int i = 0; i < symbols.length; i++) {
            for(int j = 0; j < symbols[i].length; j++) {
                symbols[i][j] = "O";
            }
        }

        symbols[symbols.length - 1][symbols[0].length - 1] = "X";

        print2DArray(symbols);

    }

    public static void print2DArray(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}