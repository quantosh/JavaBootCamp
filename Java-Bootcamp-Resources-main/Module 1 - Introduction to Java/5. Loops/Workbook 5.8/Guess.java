import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        // Get a random number
        double secretNumber = Math.random() * 5;
        // Conver double to int recasting it
        int randomToInt = (int) secretNumber;
        // Solve the 0 random number
        randomToInt += 1;

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");        
        Scanner scan = new Scanner(System.in);
        int userNumber = 0;
        userNumber = scan.nextInt();
        while (true) {
            System.out.print("Guess again: ");
            userNumber = scan.nextInt();
            if(userNumber == randomToInt){
                System.out.println("You got it");
            }
        }  
    }

}
