import java.util.Scanner;
import java.util.Arrays;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("How many pizza toppings do you want?");
        int toppings = scan.nextInt();
        // Task 2 – Create the array here
        String[] ingredients = new String[toppings];
        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         *  Pick up the user's toppings and store them in the array.
         */
        for (int i = 0; i < ingredients.length; i++){
            System.out.println("What toppings you want in your pizza?");
            ingredients[i] = scan.next();
            
        }
        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

            System.out.println("Your toppings are: " + Arrays.toString(ingredients));
        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */
        System.out.println("The order its right? answer 'yes' or 'no'");
        String order = scan.next();
        if(order.equals("yes")){
            System.out.println("Your order will be ready in 10 minutes, enjoy it!");
        } else {
            System.out.println("Sorry customer, call Java's Pizza again");
        }
        scan.close();
    }
}
