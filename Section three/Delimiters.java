import java.util.Scanner;

import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two very big integers (on the same line)");
        long big1 = scan.nextLong();
        long big2 = scan.nextLong();
        System.out.println("Enter two decimals (on the same line)");
        double dou1 = scan.nextDouble();
        double dou2 = scan.nextDouble();
        System.out.println("Enter two text values (on the same line)");
        String text1 = scan.next();
        String text2 = scan.next();
        scan.close();

        System.out.println("\t Integers: " +num1 +" and " +num2);
        System.out.println("\t Big numbers: " +big1 +" and " +big2);
        System.out.println("\t Decimals: " +dou1 +" and " +dou2);
        System.out.println("\t Text: " +text1 +" and " +text2);
    }
}
