import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
    String userInput = scan.nextLine();
    userInput = userInput.toLowerCase();
    System.out.println("Do you want to play? please answer 'yes' or 'no'.");
        switch(userInput){
            case "yes":
            System.out.println("Great \n Choose: rock - paper - scissors, shoot!");
            // pick up user's choice. and computer choice, get result
            String userChoice = scan.nextLine();
            String cpu = computerChoice();
            String human = userChoice;            
            String winner = results(cpu, human);
            System.out.println(winner);
            break;
            case "no":
            System.out.println("¡Okay, see you!");
            break;
            default: System.out.println("Please enter yes or no");
        }
        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.
    public static String computerChoice(){
        double random = Math.random() * 3;
        int randomToInt = (int)random;     
        randomToInt += 1;   
        switch(randomToInt){
            case 1: return "rock";
            case 2: return "papper";
            case 3: return "scissors";
            default: return "default";
        }
    }

    //Task 4  – Write a function that compares the choices and returns the result.
    public static String results(String computerChoice, String userChoice){
        System.out.println("Battle begins.. \nYour: " + userChoice + "\nComputer: " + computerChoice);
        if(userChoice.equals("scissors") && computerChoice.equals("paper")){
            return "User win";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")){
            return "User win";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")){
            return "User win";
        } else if (userChoice.equals(computerChoice)){
            return "¡Its a tie!";
        } else {
            return "Computer win";
        }
    }
}
