package factor;

import java.util.Arrays;

public class Arrayer {

    private static int count;

    // summation() accepts an array of integers and returns the sum of all numbers within.
    // ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int sum = 0;
        for (int i = 0 ; i < numbers.length ; i++) {
            sum += numbers[i];
            //start at 0, as long as i is less than the length of the array, increment.
            //the sum is greater than or equal to the array of numbers, or i.
        }
        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    // ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        int i = 0;
        do {
            if (numbers[i] < 0) {
                return i;
            }
            i++;
        } while(i < numbers.length);

        return -1;
        //returning -1 will end the loop.
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    // ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
    
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] != n) {
                count++;
                //if i is less than the length, then increment. if it isn't equal to n, or the number you want
                //to remove, then add it to your count. this excludes instances of n.
            }
        }
        int[] result = new int[count];
        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            //when you start at 0, and i is less than the length, then increment until 
            //i is greater than that length.
            if(numbers[i] != n) {
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
        int[] result = new int[first.length + second.length];
        //the result of this will be a new int array of the length of the first array
        //plus the length of the second array.
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            result [i] = first [i];
            count++;
            //counts/copies everything over into the first sequence
        }
        for (int i = 0; i < second.length; i++){
            result[count++] = second [i];
            //same function as previous, adds to second sequence
        }
        Arrays.sort (result);
        return result;
        //uses the sort function and sorts it into a new sequence that is in numerical order
        

    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    // ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        // TODO implement
        return new int[0];
        int[] result = new int [doubles.length];
        for (int i = 0; i < doubles.length; i++);
        if (doubles[i] % 1 >= 0.5) {
            result [i] = (int) doubles [i] + 1;

        } else {
            return [i] = (int doubles[i]);
        }
        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    // ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    //I SWEAR i actually tried on this one. it's now 7:42 on saturday, i've been staring at this for 
    //1 hr 30 mins now. i consulted stackoverflow for this one and took a look at different solutions.
    //i don't know why there's still squigglies. the pain never ends. send help.
    public static int evensOnly(int[] numbers) {
        
        int[]result = new int[evensOnly(numbers)];
        //set result to a NEW int that only contains even ints. this was given in the evens only() thing up top.
        for (int i = 0; i < numbers.length - 1; i++) {
            //if i is less than the length minus one (b/c you start counting at 0), add to your
            //new array
        if (numbers[i] % 2 == 0){
            //all even numbers can divide by 2. therefore, i%2 should give you all the even numbers.
            count++;
            //add to a new array
        }
        return count;
        //self explanatory. return all your even numbers.
    }
        return new int[0];
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    // ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        // TODO implement
        for (int i = 0; i < numbers.length; i++){
            //whatever i is, it must be less than the length of the list. 
            numbers [i] = numbers [i] % 10;
            //if listt numbers are divisible by 10, you get the last digit
        }
        return numbers;
    }
}
