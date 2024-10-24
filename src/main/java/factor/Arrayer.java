package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    // ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        // TODO implement
        int sum = 0; 
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
            return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    // ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        // TODO implement
        int i = 0;
        do{
            if (numbers[i] < 0){
            return i;
            }
            i++; 
        } while (i < numbers.length);
        return -1;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    // ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        // TODO implement
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != n){
                count++;
            }
        }
        int [] result = new int[count];
        int position = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != n){
                result[position] = numbers[i];
                position++;
            }
        }
        return result;
    }
    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    // ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        // TODO implement
        // HINT: use Arrays.sort()
        int [] result = new int[first.length + second.length];
        int count = 0;
        for (int f = 0; f < first.length; f++){
            result[f] = first[f];
            count++;
        }
        for (int s = 0; s < second.length; s++){
            result[count++] = second[s];
            
        }
        Arrays.sort(result);
        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    // ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        // TODO implement
        int[] rounded = new int[doubles.length];
        for (int d = 0; d < doubles.length; d++){
            if (doubles[d] % 1 >= 0.5) {
                rounded[d] = (int)doubles[d] + 1;
            } else {
                rounded[d] = (int)doubles[d];
            }
        }
        return rounded;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    // ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        // TODO implement
        int count = 0; 
        for (int e = 0; e < numbers.length; e++){
            if (numbers[e] % 2 == 0){
                count++;
            }
        }
        int[] onlyevens = new int[count];
        int position = 0;
        for (int e = 0; e < numbers.length; e++){
            if (numbers[e] % 2 == 0){
                onlyevens[position] = numbers[e];
                position++;
            }
        }
        return onlyevens;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    // ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        // TODO implement
        for (int l = 0; l < numbers.length; l++){
            numbers[l] = numbers[l] % 10; 
        } 
        return numbers;
    }
}
