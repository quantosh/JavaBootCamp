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
    // Get "infinite" numbers by user
    while (score < 3) { // if user get 3 points game stop
      dice = rollDice();
      System.out.println("\nYou rolled a: " + dice);
      if (dice == 6) { // 6 game stop
        System.out.println("End of game - You lose");
        break;
      } else if (dice == 4) { // 4 nothing happens
        System.out.println("0 Points Keep Rolling");
        continue;
      } else { // 1 2 3 5 score ++ || Recount
        System.out.println("Congrats +1 point, you got: " + score + " points.");
        score++;
      }
    }

    if (score >= 3) {
      System.out.println("\nWow, there is a lucky one. \nYour score is: " + score);
    } else {
      System.out.println("\nTough luck, you lose :( \nYour score is: " + score);
    }
    
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
