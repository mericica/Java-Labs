package Problem1;

public class Grades {
    public int[] notSufficiantGrades(int[] grades) {
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
        int sum = 0;
        for(int i=0; i<grades.length; i++){
            sum += round(grades[i]);
        }
        return sum/grades.length;
    }

    public int[] roundArray(int[] grades){
        int[] finaleNoten = new int[0];
        for(int i=0; i<grades.length; i++){
            finaleNoten = addToArray(finaleNoten, round(grades[i]));
        }
        return finaleNoten;
    }

    public int maxGrade(int[] grades){
        int maxGrade = grades[0];
        for(int i=0; i<grades.length; i++){
            if(round(grades[i]) > maxGrade){
                maxGrade = round(grades[i]);
            }
        }
        return maxGrade;
    }
}
