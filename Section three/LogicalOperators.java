public class LogicalOperators {
    public static void main(String[] args) {
        // or || you can make more than 2 comparisons in a condition
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")){
            System.out.println("Congratulations you got the scholarship");
        } else {
            System.err.println("We're sorry, you didn't get the scholarship");
        }
        // and &&
        int credits = 90;
        double GPA = 1.99;
        if (credits >= 40 && GPA >= 2.0){
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 and 2.0 GPA to get your diploma.");
        }
    }  
}
