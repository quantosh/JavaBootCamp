import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Thank you for taking the survey");
        System.out.println("\nWhat's your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on Fast Food?"); 
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy Fast Food?");
        int foodAmount = scan.nextInt();
        counter++;
        
        System.out.println("\n Thank you " +name+ " for answering the all " +counter+ " questions.");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + "times");
        System.out.println("Weekly, you speend $: " +(coffeeAmount*coffeePrice) + " on coffee");
        System.out.println("Weekly, you speend $: " +(foodAmount*foodPrice) + " on food");
        scan.close();
    }
}
