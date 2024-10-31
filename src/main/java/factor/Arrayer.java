package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    // ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int sum = 0;
        // Creates a loop to establish i
        for (int i = 0; i < numbers.length; i ++){
        // Adds all integers in the list numbers for the length i to get the sum
            sum += numbers[i];
        }
        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    // ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        // Sets i equal to zero
        int i = 0;
        do{
        // States that if i is less than zero it gets returned since it is a negative
            if(numbers[i] < 0){
                return i;
            }
            i ++;
        }while(i < numbers.length);
        return -1;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    // ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        // Establishes count to keep track of everything
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
        // if the integer i is not equal to n, the variables value is increased by 1
            if(numbers[i] != n){
                count++;
            }
        }
        // Creates a new string that keeps track of the position and also adds all numbers
        // not equal to n
        int[] result = new int[count];
        int position = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != n){
                result[position] = numbers[i];
                position++;
            }
        }
        // Prints out the contents of the whats in the string result.
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + " ");
        }
        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    // ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        // Creates a new string thats as long as the first two
        int[] result = new int[first.length + second.length];
        int count = 0;
        // Adds the intergers from the list "first" and "second" into a new one
        for(int i = 0; i < first.length; i++){
            result[i] = first[i];
            count++;
        }
        for(int i = 0; i < second.length; i++){
            result[count++] = second[i];
        }
        Arrays.sort(result);
        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    // ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        // Creates a new list to hold all the numbers that have to be rounded
        int[] round = new int[doubles.length];
        for(int i = 0; i < doubles.length; i++){
        // Finds if the number has a decimal that needs to round up if the modulo 1 is 
        // greater than or equal to 0.5
            if(doubles[i] % 1 >= 0.5){
                round[i] = (int)doubles[i] + 1;
            } else {
                round[i] = (int)doubles[i];
            }
        }
        return round;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    // ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        // Creates a count to keep track of everything
        int count = 0;
        for(int i = 0; i < numbers.length; i ++){
        // Deterimines if a numer is divisible by 2
            if(numbers[i] % 2 == 0){
                System.out.println(numbers);
                count++;
            }
        }
        // Creates a new list to hold all the even numbers found in the old list
        int[] result = new int[count];
            int position = 0;
            for(int i = 0; i < numbers.length; i++){
        // Checks again if numbers are multiples of 2
                if(numbers[i] % 2 == 0){
                    result[position] = numbers[i];
                    position++;
                }
            }
            return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    // ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        // Establishes a for loop where i is less than the length of the list
        for(int i = 0; i < numbers.length; i++){
        // Ensures that the list numbers[i] is equal to that modulo 10 
        // to get the remaining digit of the large number
            numbers[i] = numbers[i] % 10;
        }
        return numbers;
    }
}
