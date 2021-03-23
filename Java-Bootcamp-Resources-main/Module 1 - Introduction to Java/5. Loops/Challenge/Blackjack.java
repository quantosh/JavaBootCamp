import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        // Task 3 – Wait for the user to press enter.
        scan.nextLine();
        // Task 4 – Get two random cards.
        int user1 = drawRandomCard();
        int user2 = drawRandomCard();
        int userPoints = user1 + user2;
        String userCard1 = cardString(user1);
        String userCard2 = cardString(user2);

        // – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        System.out.println("You get a: \n" + userCard1);
        System.out.println("And a: \n" + userCard2);
        // Task 5 – Print the sum of your hand value.
        // – print: your total is: <hand value>
        System.out.println("The points of your cards are: " + userPoints);

        // Task 6 – Get two random cards for the dealer.
        // – Print: The dealer shows \n" + <first card> + "\nand has a card facing down
        // \n" + <facedown card>
        // – Print: \nThe dealer's total is hidden
        int cpu1 = drawRandomCard();
        int cpu2 = drawRandomCard();
        int cpuPoints = cpu1 + cpu2;
        String dealerCard1 = cardString(cpu1);
        String dealerCard2 = cardString(cpu2);

        System.out.println("Dealer get a: \n" + dealerCard1);
        System.out.println("Has a facing card down: \n" + faceDown());
        // Task 8 – Keep asking the player to hit or stay (while loop).
        // 1. Every time the player hits
        // – draw a new card.
        // – calculate their new total.
        // – print: (new line) You get a (new line) <show new card>.
        // - print: your new total is <total>

        // 2. Once the player stays, break the loop.
        int userTotal = userPoints;
        String hitOrStay = hitOrStay();
        if (hitOrStay.equals("hit")) {
            int userHit = drawRandomCard();
            System.out.println("You get a: \n" + cardString(userHit));
            userTotal = userPoints + userHit; // Sumo los pts de la carta a pts totales
            System.out.println("Your new total is: " + userTotal);
        }
        // For tasks 9 to 13, see the article: Blackjack Part II.
        if (userTotal > 21){
            System.out.println("Bust! Player loses");
            System.exit(0);
        }
        
        System.out.println("Dealers Turn");
        System.out.println("Dealer cards are: \n" + dealerCard1);
        System.out.println("And a : \n" + dealerCard2);
        int dealerTotal = cpuPoints;
        while(dealerTotal < 17) {
            int dealerHit = drawRandomCard();
            System.out.println("Dealer gets a: \n" + cardString(dealerHit));
            dealerTotal = cpuPoints + dealerHit;
            System.out.println("Dealer new total is: " + dealerTotal);
            if(dealerTotal < 21){
                System.out.println("Bust! Dealer loses");
                System.exit(0);
            } 
            if (userTotal > dealerTotal){
                System.out.println("Player WINS!");
                System.exit(0);
            } else {
                System.out.println("Dealer WINS!");
                System.exit(0);
            } 
        }
        scan.close();

    }

    /**
     * Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function: 1. Gets a random number between 1 and 13. 2.
     *         Returns a card.
     */
    public static int drawRandomCard() {
        double random = Math.random() * 13;
        int rToInt = (int) random;
        rToInt += 1;
        return rToInt;
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card. Function
     * name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function: 1. Returns a String drawing of the card.
     */

    public static String cardString(int cardNumber) {
        String card;
        switch (cardNumber) {
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

    public static String faceDown() {
        return " \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 \n"
                + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                + " \u2502\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2502 \n"
                + " \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 \n";
    }

    /**
     * Task 7 – make a function that asks the user to hit or stay. Function name –
     * hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function: 1. Asks the user to hit or stay. 2. If the user
     *         doesn't enter "hit" or "stay", keep asking them to try again by
     *         printing: Please write 'hit' or 'stay' 3. Returns the user's option
     */
    public static String hitOrStay() {
        System.out.println("You hit or stay? Please write 'hit' or ''stay'");
        String option = scan.nextLine();
        boolean stayOrHit = true;
        while(stayOrHit){
            if (option.equals("hit")) {
                return "hit";
            } else if (option.equals("stay")) {
                stayOrHit = false;
                return "stay";
            } else if (!option.equals("stay") || !option.equals("hit")) {
                boolean equal = true;
                while (equal) {
                    System.out.println("Please write 'hit' or 'stay'.");
                    option = scan.nextLine();
                    if (option.equals("stay") || !option.equals("hit")) {
                        equal = false;
                    }
                }
            }
        }
        return option;
    }

}
