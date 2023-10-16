package Problem3;

import java.util.Arrays;
import java.util.Objects;

public class BigNumberTest {
    BigNumber b1 = new BigNumber();
    int[] array1 = new int[]{4, 2, 2};
    int[] array2 = new int[]{5, 7, 9};
    public void sumTest(){
        int[] expectedResult = new int[]{1, 0, 0, 1};
        assert Arrays.equals(b1.sum(array1, array2), expectedResult);
    }

    public void diffTest(){
        int[] expectedResult = new int[]{1, 5, 7};
        assert Arrays.equals(b1.diff(array1, array2), expectedResult);
    }
    BigNumber b2 = new BigNumber();

    int[] array3 = new int[]{1, 2, 2};
    int digit = 2;
    public void mulTest(){
        int[] expectedResult = new int[]{2, 4, 4};
        assert Arrays.equals(b2.mul(array3, digit), expectedResult);
    }
    public void divTest(){
        int[] expectedResult = new int[]{0, 6, 1};
        assert Arrays.equals(b2.div(array3, digit), expectedResult);
    }

    //unexpected tests:
    BigNumber b3 = new BigNumber();
    int[] array1Empty = new int[0];
    int[] array2Empty = new int[0];
    public void sumTestUnexpected(){
        int[] expectedResult = new int[]{-1};
        assert Arrays.equals(b1.sum(array1Empty, array2Empty), expectedResult);
    }

    public void diffTestUnexpected(){
        int[] expectedResult = new int[]{-1};
        assert Arrays.equals(b1.diff(array1Empty, array2Empty), expectedResult);
    }

    public void mulTestUnexpected(){
        int[] expectedResult = new int[]{-1};
        assert Arrays.equals(b2.mul(array1Empty, digit), expectedResult);
    }
    public void divTestUnexpected(){
        int[] expectedResult = new int[]{-1};
        assert Arrays.equals(b2.div(array1Empty, digit), expectedResult);
    }



}
