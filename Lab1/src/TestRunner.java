import Problem1.GradesTest;
import Problem2.NumbersArrayTest;
import Problem3.BigNumberTest;
import Problem4.ElectronicShopTest;

public class TestRunner {
    public static void main(String[] args){
        GradesTest gradesTest = new GradesTest();
        NumbersArrayTest nrArrTest = new NumbersArrayTest();
        BigNumberTest b1 = new BigNumberTest();
        ElectronicShopTest e1 = new ElectronicShopTest();

        //Problem1 Test
        gradesTest.addToArryTest();
        gradesTest.notSuffGradesTest();
        gradesTest.maxGradeTest();
        gradesTest.averageTest();
        gradesTest.roundedGradesTest();
        gradesTest.averageTestUnexpected();
        gradesTest.maxGradeTestUnexpected();
        gradesTest.notSuffGradesTestUnexpected();
        gradesTest.roundedGradesTestUnexpected();

        //Problem2 Test
        nrArrTest.minAndMaxTest();
        nrArrTest.minAndMaxSum();
        nrArrTest.minAndMaxTestUnexpected();
        nrArrTest.minAndMaxTestUnexpected();
        nrArrTest.minAndMaxSumTestUnexpected();

        //Problem3 Test
        b1.sumTest();
        b1.diffTest();
        b1.mulTest();
        b1.divTest();
        b1.diffTestUnexpected();
        b1.sumTestUnexpected();
        b1.mulTestUnexpected();
        b1.divTestUnexpected();

        //Problem4 Test
        e1.buyMaxTest();
        e1.cheapestKeyboardTest();
        e1.mostExpensiveTest();
        e1.buyTest();
        e1.buyTestUnexpected();
        e1.cheapestKeyboardUnexpected();
        e1.mostExpensiveUnexpected();
        e1.buyMaxTestUnexpected();


    }
}
