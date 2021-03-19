import java.util.Scanner;

public class JavaRolls {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rolling Java. Type anything to start.");
    String start = scan.nextLine();

    System.out.println("Great, here are the rules:");
    System.out.println(" - If you roll a 6 the game stops.");
    System.out.println(" - If you roll a 4 nothing happens.");
    System.out.println(" - Otherwise, you get 1 point.");
    System.out.println("You must collect at least 3 points to win.");

    int score = 0;
    int dice = 0;
    // Users win if 3 or more score
    if(score >= 3){
      // Get "infinite" numbers by user
      while (true) {
        dice = rollDice();
        System.out.println("You :" +userInput +"\nDice: " + dice);
        if(score == dice){
          score++;
        }
      }
    }

    

    /*
     * Task 3 1. Make a while loop that runs forever 2. During each run, get them to
     * enter a random value
     * 
     * 
     * Task 5 1. During each run, call the rollDice() function. 2. Print each dice
     * roll like so: You rolled a <diceRoll>.
     * 
     * 
     * Task 6 If the user rolls a 6: 1. print: End of game. 2. stop the game.
     * 
     * If the user rolls a 4: 1. print: Zero points. Keep rolling.
     * 
     * If the user rolls anything else: 1. update the points variable by 1 2. print:
     * One point. Keep rolling.
     * 
     */

    /*
     * Task 7
     * 
     * 1. After the game ends, check the user's points.
     * 
     * System.out.println("\nYour score is: " + score);
     * 
     * 2. If the score is greater than or equal to 3, print: Wow, that's lucky. You
     * win! Otherwise, print: Tough luck, you lose :(
     */

  }

  public static int rollDice() {
    double random = Math.random() * 6;
    int rToInt = (int) random;
    rToInt += 1;
    return rToInt;
  }
}
