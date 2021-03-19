import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("Rolls for you!" );

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 < 0 || num1 > 6 || num2 < 0 || num2 > 6 || num3 < 0 || num3 > 6 ){
            System.out.println("Error the number cannot be negative or more than 6");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("House sum = " + sumDiceRolls +". Player sum = " + sumOfNumbers);

        if(checkWin(sumDiceRolls, sumOfNumbers)){
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry! you lose.");
        }
        

    }        
    
    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers){
        return (sumDiceRolls > sumOfNumbers && sumOfNumbers - sumDiceRolls < 3);
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
}
