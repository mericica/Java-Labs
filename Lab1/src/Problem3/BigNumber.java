package Problem3;

import java.util.Arrays;

public class BigNumber {
    public int[] sum(int[] array1, int[] array2){
        int carry = 0;
        int[] sumArray = new int[array1.length];

        for(int i=array1.length-1; i>=0; i--){
            sumArray[i] = array1[i] + array2[i] + carry;
            if(sumArray[i] >= 10){
                carry=1;
            }
            else{
                carry = 0;
            }
            sumArray[i] = sumArray[i] %10;
        }
        //expand the array if there is a carry left
        if(carry!=0){
            int[] temp = new int[sumArray.length+1];
            temp[0] =  carry;
            System.arraycopy(sumArray, 0, temp, 1, sumArray.length); //array copy
            return temp;
        }

        return sumArray;
    }

    public int[] diff(int[] array1, int[] array2){
        //checking if the first array is bigger than the second
        int number1 = 0;
        int number2 = 0;
        for (int k : array1) {
            number1 = number1 * 10 + k;
        }
        for (int j : array2) {
            number2 = number2 * 10 + j;
        }

        if(number1< number2){
            int[] temp = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                temp[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = temp[i];
            }
        }

        int borrow = 0;
        int[] diffArray = new int[array1.length];

        for(int i=array1.length-1; i>=0; i--){
            if(array1[i] - array2[i] < 0){
                diffArray[i] = array1[i] + 10 - array2[i] - borrow;
                borrow = 1;
            }
            else{
                diffArray[i] = array1[i] - array2[i];
                borrow = 0;
            }
        }

        return diffArray;
    }

    public int[] mul(int[] array, int digit){
        int[] mulArray = new int[array.length];
        int carry = 0;
        for(int i=array.length-1; i>=0; i--){
            mulArray[i] = (array[i] * digit + carry) % 10;
            carry = (array[i] * digit + carry) /10;
        }
        //expand the array if there is a carry left
        if(carry!=0){
            int[] result = new int[array.length+1];
            result[0] = carry;
            System.arraycopy(mulArray, 0, result, 1, array.length);
            return result;
        }
        return mulArray;
    }

    public int[] div(int[] array, int digit){
        int remainder = 0;
        int[] divArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            divArray[i] = (10 * remainder + array[i]) / digit;
            remainder = (10 * remainder + array[i]) % digit;
        }
        return divArray;
    }
}
