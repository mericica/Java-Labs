package Problem3;

import java.util.Arrays;
import java.util.Objects;

public class BigNumberTest {
    public void sumTest(){
        BigNumber b1 = new BigNumber();

        int[] array1 = new int[]{4, 2, 2};
        int[] array2 = new int[]{5, 7, 9};
        int[] expectedResult = new int[]{1, 0, 0, 1};



    }

    public void diffTest(){
        BigNumber b1 = new BigNumber();
        int[] array1 = new int[]{4, 2, 2};
        int[] array2 = new int[]{5, 7, 9};
        int[] expectedResult = new int[]{1, 5, 7};
        assert Arrays.equals(b1.diff(array1, array2), expectedResult);

    }

    public void mulTest(){
        BigNumber b1 = new BigNumber();

        int[] array3 = new int[]{1, 2, 2};
        int digit = 2;
        int[] expectedResult = new int[]{2, 4, 4};
        assert Arrays.equals(b1.mul(array3, digit), expectedResult);

    }
    public void divTest(){
        BigNumber b1 = new BigNumber();
        int[] array3 = new int[]{1, 2, 2};
        int digit = 2;
        int[] expectedResult = new int[]{0, 6, 1};
        assert Arrays.equals(b1.div(array3, digit), expectedResult);
    }

    //wrong tests:
    public void sumTestFalse(){
        BigNumber b1 = new BigNumber();

        int[] array1 = new int[]{4, 2, 2};
        int[] array2 = new int[]{5, 7, 9};
        int[] expectedResult = new int[]{2, 0, 0, 1};



    }

    public void diffTestFalse(){
        BigNumber b1 = new BigNumber();
        int[] array1 = new int[]{4, 2, 2};
        int[] array2 = new int[]{5, 7, 9};
        int[] expectedResult = new int[]{1, 4, 7};
        assert Arrays.equals(b1.diff(array1, array2), expectedResult);

    }

    public void mulTestFalse(){
        BigNumber b1 = new BigNumber();

        int[] array3 = new int[]{1, 2, 2};
        int digit = 2;
        int[] expectedResult = new int[]{2, 4};
        assert Arrays.equals(b1.mul(array3, digit), expectedResult);

    }
    public void divTestFalse(){
        BigNumber b1 = new BigNumber();
        int[] array3 = new int[]{1, 2, 2};
        int digit = 2;
        int[] expectedResult = new int[]{1, 6, 1};
        assert Arrays.equals(b1.div(array3, digit), expectedResult);
    }
}
