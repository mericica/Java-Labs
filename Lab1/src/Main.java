import Problem1.Grades;
import Problem2.NumbersArray;
import Problem3.BigNumber;
import Problem4.ElectronicShop;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Problem1
        Grades n1 = new Grades();
        int[] grades = new int[]{84, 29, 30, 40, 50, 60};

        System.out.println("Not sufficiant grades: " + Arrays.toString(n1.notSufficiantGrades(grades)));
        System.out.println("Average: " + n1.average(grades));
        System.out.println("Rounded Problem1.Grades: " + Arrays.toString(n1.roundArray(grades)));
        System.out.println("Max rounded grade: " + n1.maxGrade(grades));

        /*Problem 2 - reading array from keyboard
        NumbersArray a1 = new NumbersArray();
        Scanner myArray = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = myArray.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = myArray.nextInt();
        }
        System.out.println("Max number is: " + a1.maxNr(numbers));
        System.out.println("Min number is: " + a1.minNr(numbers));
        System.out.println("Max sum without min element: " + a1.maxSum(numbers));
        System.out.println("Min sum without max element: " + a1.minSum(numbers));
*/

        //Problem3
        BigNumber b1 = new BigNumber();
        int[] array1 = new int[]{4, 2, 2};
        int[] array2 = new int[]{5, 7, 9};
        int[] array3 = new int[]{1, 2, 2};
        int digit = 2;
        System.out.println("Sum: " + Arrays.toString(b1.sum(array1, array2)));
        System.out.println("Difference: " + Arrays.toString(b1.diff(array1, array2)));
        System.out.println("Multiplication: " + Arrays.toString(b1.mul(array3, digit)));
        System.out.println("Division: " + Arrays.toString(b1.div(array3 , digit)));

        //Problem4
        int[] keyboards = new int[]{55, 30, 40, 12, 93, 22};
        int[] usbs = new int[]{10, 20, 43, 33, 25};
        ElectronicShop e1 = new ElectronicShop(keyboards, usbs);

        int budget = 3;
        System.out.println("Cheapest Keyboard: " + e1.cheapestKeyboard());
        System.out.println("Most expensive accessory:" + e1.mostExpensive());
        System.out.println("Max usb based of budget: " + e1.buyMax( budget));
        System.out.println("Money Mark gave out: " + e1.buy(budget));
    }


}