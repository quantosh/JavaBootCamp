import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        // 2D arrays are good for tables for examples
        int[][] grades = new int[3][4];

        // Harry 
        grades[0][0] = 60;
        grades[0][1] = 80;
        grades[0][2] = 50;
        grades[0][3] = 90;
        // Ron
        grades[1][0] = 10;
        grades[1][1] = 30;
        grades[1][2] = 50;
        grades[1][3] = 40;
        // Hermione
        grades[2][0] = 100;
        grades[2][1] = 100;
        grades[2][2] = 100;
        grades[2][3] = 90;

        System.out.println("Exams Points");
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        
        int[][] grades2 = {
            {99, 99, 99, 99},
            {99, 99, 99, 99},
            {99, 99, 99, 99},
        };
        System.out.println("Final exams");
        System.out.println("\tHarry: " + Arrays.toString(grades2[0]));
        System.out.println("\tRon: " + Arrays.toString(grades2[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades2[2])); 
        for(int i = 0; i < grades.length; i++){

        }
    } 
}
