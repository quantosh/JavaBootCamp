import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java";

        /*
         * Task 1 1. Pick up a username and password from the user.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");

        System.out.print("• Username: ");
        username = scan.nextLine();

        System.out.print("• Password: ");
        password = scan.nextLine();

        boolean dataMatch = true;
                
        while(dataMatch){
            if(username.equals("Samantha") && password.equals("Java")){
            System.out.println("\nSign in sucessful. Welcome!\n");
            dataMatch = false;
            } else {
                System.out.println("\nIncorrect please try again!\n");
                System.out.print("• Username: ");
                username = scan.nextLine();
        
                System.out.print("• Password: ");
                password = scan.nextLine();
            }

        }
        scan.close();

    }
}
