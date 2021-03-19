public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;  
        boolean holiday = true;
        String sentence = "";         
            // if it's a holiday, print: "woohoo, no work!");
            if(day > 5){
                holiday = true;
                sentence = "woohoo, no work!";
            } else if (day == 6 && day == 7){
                sentence = "it's the weekend, no work!";
            } else {
                sentence = "Wake up at 7:00 :( ";
            }
            System.out.println(sentence);
        }

    }
