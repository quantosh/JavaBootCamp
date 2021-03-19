import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int counter = scan.nextInt();
        System.out.println("Timmy entered: " + counter);
        for(int i=0; i<=counter; i++){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
