package Problem1;

public class GradesTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";

    public void addToArryTest() {
        Grades n1 = new Grades();
        int[] noten = new int[]{10, 20, 30};

        int newElement = 50;
        int[] result = n1.addToArray(noten, newElement);
        assert noten[0] == result[0] : SHOULD_BE_EQUAL;
        assert noten[1] == result[1] : SHOULD_BE_EQUAL;
        assert noten[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;
    }

    Grades g1 = new Grades();
    int[] grades = new int[]{84, 29, 30, 40, 50, 60};

    public void notSuffGradesTest() {
        int[] result = g1.notSufficiantGrades(grades);
        assert result[0] == 29;
        assert result[1] == 30;
    }

    public void averageTest() {
        assert (g1.average(grades) == 49);
    }

    public void roundedGradesTest() {
        int[] result = g1.roundArray(grades);
        assert result[0] == 85;
        assert result[1] == 29;
        assert result[2] == 30;
    }

    public void maxGradeTest() {
        assert (g1.maxGrade(grades) == 85);
    }

    //Tests with unexpected result:
    public void notSuffGradesTestUnexpected() {
        int[] grades = new int[0];
        int[] result = g1.notSufficiantGrades(grades);
        assert result[0] == -1;
    }

    public void averageTestUnexpected() {
        int[] grades = new int[0];
        assert (g1.average(grades) == -1);
    }

    public void roundedGradesTestUnexpected() {
        int[] grades = new int[0];
        int[] result = g1.roundArray(grades);
        assert result[0] == -1;
    }

    public void maxGradeTestUnexpected() {
        int[] grades = new int[0];
        assert (g1.maxGrade(grades) == -1);
    }

}