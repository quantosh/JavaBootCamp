import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList <String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe 3 palabras: ");
        words.add(scan.next());
        words.add(scan.next());
        words.add(scan.next());
        System.out.println("Es un palindromo? " + isPalindrome(words));
    }
    static boolean isPalindrome(ArrayList<String> w){
        
        return false;
    }
}
