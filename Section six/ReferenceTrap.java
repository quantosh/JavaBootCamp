import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // If you copy a Array in other Array you will copy the reference(pointer) not the index value
        String[] staffThisYear = new String[3];
        // To avoid this error just make a new array and copy ever value with a for loop
        for (int i = 0; i< staffLastYear.length; i++){
            staffThisYear[i] = staffLastYear[i];
        }
        staffThisYear[1] = "Abby";
        // But there is a better solution Arrays.copyOf(arrayname, array.lenght);`
        String[] copyOfArray = Arrays.copyOf(staffThisYear, staffThisYear.length);
        System.out.print("\nStaff last year: ");
        System.out.print(Arrays.toString(staffLastYear));
        System.out.print("\nStaff this year: ");
        System.out.print(Arrays.toString(staffThisYear));
        System.out.print("\nStaff copyOf: ");
        System.out.print(Arrays.toString(copyOfArray));
    }
}
