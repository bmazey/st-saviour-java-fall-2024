package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    // ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {

    int sum = 0;
    // start at position 0, go until the length of numbers, move in increments of 1
    for (int i = 0; i < numbers.length; i++ ){
        // add the number in the position to the sum
        sum += numbers[i];
    }
    // when the loop goes on to the next position it will keep addinf the next number to sum
    // so everything in sum gets added up
    // TODO implement
        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    // ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        // start at position 0, go until the length of numbers, move in increments of 1
        for (int i = 0; i < numbers.length; i++){
            // if the number is less then zero its negative, so return it
            if (numbers[i] < 0){
                return i;
            }
        }

        // TODO implement
       return -1;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    // ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        // count starts at zero
        int count = 0;
        // start at position 0, go until the length of numbers, move in increments of 1
        for (int i=0; i < numbers.length; i++ ){
            // if the number is NOT the number being removed then count it
            if (numbers[i] != n){
                count++;
            }
        }

        // keeping count is important because the number of numbers might not be the same as the new one
        // which means that the position a certain number might have in the original one might not be the same
        // in the example the number 3 has the position of 5 in the first array
        // but the position of 3 in the new array is 3
        // because of this, if you dont keep track of count and position, an index out of bounds error might occur 

        int[] result = new int[count];

        int position = 0;
        for (int i=0; i < numbers.length; i++){
            // //if the number is NOT the number being removed then keep track of its position
            if (numbers[i] != n){
                result[position] = numbers[i];
                position++;
            }
        }

        // TODO implement
        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    // ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0;

        for (int k = 0; k < merged.length; k++) {
            // if i is greater than or equal to the length merge it and put it next in the lest
            if (i >= first.length) {
                // greater number comes second
                merged[k] = second[j++];
            } else if (j >= second.length) {
                merged[k] = first[i++];
            } 
            // if not take the smaller value and put it first
            else if (first[i] < second[j]) {
                merged[k] = first[i++];
            } else {
                merged[k] = second[j++];
            }
        }
        // TODO implement
        // HINT: use Arrays.sort()
        
        return merged;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    // ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
       
        int[] result = new int [doubles.length];
        // start at position 0, go until the length of numbers, move in increments of 1
        for (int i = 0; i < doubles.length; i++) {
            // if the remainder of doubles divided by one is greater than 0.5
            if (doubles[i] % 1 >= 0.5){
                // round up by adding 1
                result[i] = (int)doubles[i] + 1;
            // if not, round it down by making it an integer
            } else{
                result[i] = (int)doubles[i];
            }
            
        }

        // TODO implement
        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    // ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
    
        int count = 0;
        // start at position 0, go until the length of numbers, move in increments of 1
        for (int i=0; i < numbers.length; i++ ){
            // if the number is divisble by 2 without a remainder its even count it
            if (numbers[i] % 2 == 0){
                count++;
            }
        }

        int[] result = new int[count];
        // keep track of position
        int position = 0;
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                result[position] = numbers[i];
                position++;
            }
        }
        

        // TODO implement
        return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    // ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        // new array 
        int[] result = new int[numbers.length];
        // // start at position 0, go until the length of numbers, move in increments of 1
        for (int i = 0; i < numbers.length; i++) {
            // mod 10 because the thousandths, hunredths and tens place is divisble by ten
            // this will leave the ones place (last digit) as the remainder
            result[i] = numbers[i] % 10;
            }
            return result; 
        }
    }
