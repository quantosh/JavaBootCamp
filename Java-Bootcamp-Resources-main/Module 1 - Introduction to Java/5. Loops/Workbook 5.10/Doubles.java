public class Doubles {
    public static void main(String[] args) {

        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("\nProgram stop if dice numbers are the same!");
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        // 1. Set up a loop that keeps running while the two dice aren't the same.
        // 2. During each run, re-roll the dice and print the two values.
        boolean notSame = true;
        while (notSame) {
            if (dice1 == dice2) {
                System.out.println("You rolled doubles: ");
                System.out.println("Dice 1: " + dice1);
                System.out.println("Dice 2: " + dice2 + "\n");
                notSame = false;
            } else {
                dice1 = rollDice();
                dice2 = rollDice();
                System.out.println("Dice 1: " + dice1);
                System.out.println("Dice 2: " + dice2 + "\n");
            }
        }
    }

    public static int rollDice() {
        double random = Math.random() * 6;
        int rToInt = (int) random;
        rToInt += 1;
        return rToInt;
    }

}
