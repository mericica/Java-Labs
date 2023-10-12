import Problem1.NotenTest;
import Problem2.NumbersArrayTest;
import Problem3.BigNumberTest;
import Problem4.ElectronicShopTest;

public class TestRunner {
    public static void main(String[] args){
        NotenTest notenTest = new NotenTest();
        NumbersArrayTest nrArrTest = new NumbersArrayTest();
        BigNumberTest b1 = new BigNumberTest();
        ElectronicShopTest e1 = new ElectronicShopTest();

        //Problem1 Test
        notenTest.addToArryTest();
        notenTest.notSuffGradesTest();

        //Problem2 Test
        nrArrTest.minAndMaxTest();
        nrArrTest.minAndMaxSum();

        //Problem3 Test
        b1.sumTest();
        b1.diffTest();
        b1.mulTest();
        b1.divTest();

        //Problem4 Test
        e1.buyMaxTest();
        e1.cheapestKeyboardTest();
        e1.mostExpensiveTest();
        e1.buyTest();
        e1.buyTestWrong();
        e1.cheapestKeyboardWrong();
        e1.mostExpensiveWrong();
        e1.buyMaxTestWrong();


    }
}
