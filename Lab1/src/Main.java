import Problem1.Grades;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Grades n1 = new Grades();
        int[] grades = new int[]{84, 29, 30, 40, 50, 60};

        System.out.println("Not sufficiant grades: " + Arrays.toString(n1.notSufficiantGrades(grades)));
        System.out.println("Average: " + n1.average(grades));
        System.out.println("Rounded Problem1.Grades: " + Arrays.toString(n1.roundArray(grades)));
        System.out.println("Max rounded grade: " + n1.maxGrade(grades));

    }


}