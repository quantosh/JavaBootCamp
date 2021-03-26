import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        // Task 3 – Create a 2D array with 100 rows and 10 columns.
        int[][] numbers = new int[100][10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = randomNumber();
            }
        }
        
        print2DArray(numbers);
    }

    public static int randomNumber() {
        double random = Math.random() * 100;
        return (int) random;
    }

    public static void print2DArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
