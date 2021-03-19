
public class BooleanComparisons {
    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        System.out.println(biologyGrade != chemistryGrade); 
        System.out.println(biologyGrade != englishGrade);

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";
        String sentence3 = "I dont love this course!";
        System.out.println(sentence.equals(sentence2));
        System.out.println(!sentence.equals(sentence2));
    }
}
