package Problem2;

public class NumbersArray {
    public int maxNr(int[] array){
        if(array.length==0){
            return -1;
        }
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int minNr(int[] array){
        if(array.length==0){
            return -1;
        }
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //helper function
    public int minIndex(int[] array){
        int min = minNr(array);
        int index = 0;
        while(array[index] != min ){
            index++;
        }
        return index;

    }

    public int maxSum(int[] array){
        if(array.length==0){
            return -1;
        }
        int index = minIndex(array);
        int newIndex = 0;
        int[] newArray = new int[array.length - 1];
        for(int i = 0; i<array.length ; i++){
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        int sum = 0;
        for(int i =0; i<newArray.length; i++){
            sum += newArray[i];
        }
        return sum;
    }

    //helper function
    public int maxIndex(int[] array){
        int max = maxNr(array);
        int index = 0;
        while(array[index] != max ){
            index++;
        }
        return index;

    }

    public int minSum(int[] array){
        if(array.length==0){
            return -1;
        }
        int index = maxIndex(array);
        int newIndex = 0;
        int[] newArray = new int[array.length - 1];
        for(int i = 0; i<array.length ; i++){
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        int sum = 0;
        for(int i =0; i<newArray.length; i++){
            sum += newArray[i];
        }
        return sum;
    }
}
