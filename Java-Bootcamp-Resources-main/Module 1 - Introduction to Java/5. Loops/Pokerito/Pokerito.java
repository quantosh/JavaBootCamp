import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(">> Les't play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println(">> It's like Poker, but a lot simpler");
        System.out.println(" - There are two players, you and the computer");
        System.out.println(" - Then, the dealer will draw five cards");
        System.out.println(
                "The player with the most river matches wins! \n>> If the matches are equal, everyone's a WINNER! ");
        System.out.println("Then, the dealer will draw five cards");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        /*
         * Task 3: Present the user with a card println 'Here's your card:' <show card>
         * <new line> println 'Here's the computer's card:' <show computer's card>
         */
        System.out.println("\nWell this are your cards");
        String player = randomCard();
        String cpu = randomCard();
        System.out.println("Your card: \n" + player);
        System.out.println("CPU card: \n" + cpu);


        /**
         * Task 4 - Draw five cards
         * 
         * • print: Now, the dealer will draw five cards. Press enter to continue. • The
         * dealer will draw a card every time the user presses enter. • Before you draw
         * a card, print the order it was drawn in: Card 1 <2 new lines> <print card>
         * Card 2 <2 new lines> <print card> ...
         */
        System.out.println("Dealer will draw 5 cards now, Press enter to continue");
        scan.nextLine();
/**
         * Task 5 - Get the winner
         * 
         * • Count your number of matches. • Count the computer's number of matches. •
         * print: Your number of matches: <yourMatches> • print: Computer number of
         * matches: <computerMatches>
         * 
         * • If you have more matches, print: You win!. • If the computer has more
         * matches, print: The computer wins! • If the matches are equal, print:
         * everyone wins!.
         */
        // Matches
        int playerMatches = 0;
        int cpuMatches = 0;

        // dealer cards
        String[] dealer;
        dealer = new String[5];
        for (int i = 0; i < 5; i++){
            dealer[i] = randomCard();
            System.out.print(dealer[i]);

            if (dealer[i].equals(player)){
                playerMatches++;
            }
            
            if (dealer[i].equals(cpu)){
                cpuMatches++;
            }
        }

        if (playerMatches > cpuMatches){
            System.out.println("Player wins");
        } else if (playerMatches < cpuMatches){
            System.out.println("Cpu wins");
        } else if (playerMatches == 0 && cpuMatches == 0){
            System.out.println("You both lose :(");
        } else if (playerMatches == cpuMatches){
            System.out.println("Every one wins!");
        }
        scan.close();
    }

    /**
     * Task 1
     * 
     * Function name – randomCard
     * 
     * @return (String)
     * 
     *         Inside the function: 1. Gets a random number between 1 and 13. 2.
     *         Returns a card that matches the random number (get the String values
     *         from cards.text).
     */

    public static String randomCard() {
        double random = Math.random() * 13;
        int rToInt = (int) random;
        rToInt += 1;
        String card;
        switch (rToInt) {
        case 1:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 2:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u25022\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25912\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 3:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u25023\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25913\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 4:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u25024\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25914\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 5:
            card = " \u25025\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25915\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 6:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u25026\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25916\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 7:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u25027\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25917\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 8:
            card = " \u25028\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2591\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25918\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 9:
            card = " \u25029\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u25919\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 10:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u250210\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2660\u2591\u2660\u2591\u2660\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2660\u2591\u259110\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 11:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u2502J\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2588\u2588\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2588\u2591\u2591\u2588\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2588\u2588\u2588\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591J\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 12:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u2502Q\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2588\u2588\u2588\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2588\u2591\u2591\u2591\u2588\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2588\u2588\u2588\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2591Q\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        case 13:
            card = " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                    + " \u2502K\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2588\u2588\u2591\u2591\u2588\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2588\u2588\u2588\u2588\u2591\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2588\u2588\u2591\u2591\u2588\u2591\u2591\u2502 \n"
                    + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591K\u2502 \n"
                    + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
            break;
        default:
            card = "el pepe";
        }
        return card;
    }
}
