package Problem1;

public class Grades {
    public int[] notSufficiantGrades(int[] grades) {
        if (grades.length == 0){
            return new int[]{-1};
        }
        int[] finaleNoten = new int[0];

        for (int i = 0; i < grades.length; i++) {
            if (round(grades[i]) < 40) {
                finaleNoten = addToArray(finaleNoten, grades[i]);
            }

        }
        return finaleNoten;
    }

    public int round(int grade) {
        if (grade < 38) {
            return grade;
        } else {
            //return grade % 5 >2 ? grade+ grade %5 : grade; = acelasi lucru ca if-ul de jos doar ca pe o singura linie
            if(grade % 5 > 2){
                return grade + 5 - grade % 5;
            }
            return grade;
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public int average(int[] grades){
        if (grades.length == 0){
            return -1;
        }
        int sum = 0;
        for(int i=0; i<grades.length; i++){
            sum += round(grades[i]);
        }
        return sum/grades.length;
    }

    public int[] roundArray(int[] grades){
        if (grades.length == 0){
            return new int[]{-1};
        }
        int[] finaleNoten = new int[0];
        for(int i=0; i<grades.length; i++){
            finaleNoten = addToArray(finaleNoten, round(grades[i]));
        }
        return finaleNoten;
    }

    public int maxGrade(int[] grades){
        if (grades.length == 0){
            return -1;
        }
        int maxGrade = grades[0];
        for(int i=0; i<grades.length; i++){
            if(round(grades[i]) > maxGrade){
                maxGrade = round(grades[i]);
            }
        }
        return maxGrade;
    }
}
