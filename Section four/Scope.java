public class Scope {
    // You cant access this date every where inside the class
    static int dogs = 5;
    public static void main(String[] args) {
        // Scope means ámbito lo que esta entre {ámbito}
        System.out.println(dogs);
        someFunction();
        int apples = 1 ;
    }

    public static void someFunction(){
        System.out.println();
    }
}
