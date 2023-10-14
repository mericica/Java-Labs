package Problem2;

public class NumbersArrayTest {
    NumbersArray n1 = new NumbersArray();

    public void minAndMaxTest(){
        int[] array = new int[]{10, 5, 132, 45, 8};
        assert n1.maxNr(array) == 132;
        assert n1.minNr(array) == 5;
        //wrong test:
       // assert n1.maxNr(array) == 10;
        //assert n1.minNr(array) == 8;
    }

    public void minAndMaxSum(){
        int[] array = new int[]{1, 2, 3, 4};
        assert n1.minSum(array) == 6;
        assert n1.maxSum(array) == 9;
        //wrong test:
        //assert n1.minSum(array) == 16;
        //assert n1.maxSum(array) == 1;

    }

    public void minAndMaxTestUnexpected(){
        int[] array = new int[0];
        assert n1.maxNr(array) == -1;
        assert n1.minNr(array) == -1;

    }

    public void minAndMaxSumTestUnexpected(){
        int[] array = new int[0];
        assert n1.maxSum(array) == -1;
        assert n1.minSum(array) == -1;

    }

    //Wrong tests - THESE WILL GIVE AN ASSERTION ERROR IF RUN;
    public void minAndMaxTestFalse(){
        int[] array = new int[]{10, 5, 132, 45, 8};
        //wrong test:
        assert n1.maxNr(array) == 10;
        assert n1.minNr(array) == 8;
    }

    public void minAndMaxSumFalse(){
        int[] array = new int[]{1, 2, 3, 4};
        //wrong test:
        assert n1.minSum(array) == 16;
        assert n1.maxSum(array) == 1;

    }




}
