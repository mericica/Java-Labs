package Problem1;

import Problem1.Grades;

public class NotenTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";

    public void addToArryTest(){
        Grades n1 = new Grades();
        int[] noten = new int[]{10, 20, 30};

        int newElement = 50;
        int[] result = n1.addToArray(noten, newElement);


        assert noten[0] == result[0]: SHOULD_BE_EQUAL;
        assert noten[1] == result[1]: SHOULD_BE_EQUAL;
        assert noten[2] == result[2]: SHOULD_BE_EQUAL;
        assert result[3] == newElement: SHOULD_BE_EQUAL;
    }
}
