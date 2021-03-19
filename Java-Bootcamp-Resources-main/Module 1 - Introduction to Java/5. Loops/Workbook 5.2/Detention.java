import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        //Task 1 – Scan for the nextLine(), and print it 99 times. 
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("You wrote: " +sentence + "/nlest write 100 times.");
        for(int i = 0; i <= 100; i++){
            System.out.println(i+". " + sentence);
        }
    }
}
