public class Hello { 
    public static void main(String[] args) { 

        // String h = "Halloween";
        
        String[] kelly = {"Here's", "the", "thing", "we", "started", "out", "friends"};
        // System.out.println(kelly);
        // for(int i = 0; i < kelly.length; i++) {
        //     System.out.println(kelly[i]);
        // }

        // System.out.println(kelly[0]);
        // System.out.println(kelly[0].charAt(0));
        // System.out.println(kelly[kelly.length - 1]);

        // Notice that length is a property on arrays not a method!
        // for(int i = 0; i < kelly.length; i++) {
        //     System.out.println(kelly[i]);
        // }

        // arrays are mutable, but they are NOT resizeable!
        // the default value of a numerical array is 0!
        // int[] numbers = new int[10];
        // for(int i = 0; i < numbers.length; i++) {
        //     if(i % 2 == 0) {
        //         numbers[i] = 2;
        //     } else {
        //         numbers[i] = 1;
        //     }
        //     System.out.print(numbers[i]);
        // }

        

        // TODO Let's say we wanted to set the first value to 2 ...

        // reassign all values
        // for(int i = 0; i < numbers.length; i++) {
        //     numbers[i] = 2;
        // }

        // System.out.println("");

        // for(int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i]);
        // }

        // Try to add a number to the end!
        // numbers[10] = 2;

        // TODO add a number to the end of an int array

        // TODO remove all instances of a given number from an int array

        int[] numbers = {3, 1, 2, 1, 3, 2, 4, 1};
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 1) {
                count++;
            }
        }

        int[] result = new int[count];
        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 1) {
                result[position] = numbers[i];
                position++;
            }
        }

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
// String e = new String(Character.toChars(0x1F43C));