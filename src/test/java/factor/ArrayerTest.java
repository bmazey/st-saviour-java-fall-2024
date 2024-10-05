package factor;

import org.junit.jupiter.api.Test;

public class ArrayerTest {

    @Test
    public void testSummation() {
        int[] first = {0, 1, 2, 3, 4};
        assert Arrayer.summation(first) == 10;

        int[] second = {-1, -2, 1, -3};
        assert Arrayer.summation(second) == -5;
    }

    @Test
    public void testFindNegative() {
        int[] first = {-1, 0, 4, 5, 6};
        assert Arrayer.findNegative(first) == 0;

        int[] second = {0, 4, 5, 6, -3, 7};
        assert Arrayer.findNegative(second) == 4;
    }

    @Test
    public void testRemove() {
        int[] first = {0, 0, 1, 1, 0};
        int[] result = Arrayer.remove(first, 0);
        
        assert result[0] == 1;
        assert result[1] == 1;
        assert result.length == 2;

        int[] second = {2, 5, 4, 5, 5, 7};
        result = Arrayer.remove(second, 5);

        assert result[0] == 2;
        assert result[1] == 4;
        assert result[2] == 7;
        assert result.length == 3;
    }

    @Test
    public void testMerge() {
        int[] first = {2, 4, 8};
        int[] second = {3, 7, 11};

        int[] result = Arrayer.merge(first, second);
        assert result[0] == 2;
        assert result[1] == 3;
        assert result[2] == 4;
        assert result[3] == 7;
        assert result[4] == 8;
        assert result[5] == 11;
        assert result.length == 6;
    }

    @Test
    public void testRoundup() {
        double[] doubles = {2.1, 4.8, 3.5, 0.2};
        int[] result = Arrayer.roundUp(doubles);

        assert result[0] == 2;
        assert result[1] == 5;
        assert result[2] == 4;
        assert result[3] == 0;
        assert result.length == 4;
    }

    @Test
    public void testEvensOnly() {
        int[] numbers = {2, 3, 0, 12, 11, 17};
        int[] result = Arrayer.evensOnly(numbers);

        assert result[0] == 2;
        assert result[1] == 0;
        assert result[2] == 12;
        assert result.length == 3;
    }

    @Test
    public void testLastOfFourDigits() {
        int[] digits = {8001, 1506, 1700, 8999};
        int[] result = Arrayer.lastOfFourDigits(digits);

        assert result[0] == 1;
        assert result[1] == 6;
        assert result[2] == 0;
        assert result[3] == 9;
        assert result.length == 4; 
    }
}
