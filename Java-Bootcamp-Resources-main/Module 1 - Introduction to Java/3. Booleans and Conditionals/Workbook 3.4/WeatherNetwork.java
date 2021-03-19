import java.util.Scanner;

public class WeatherNetwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the temp man!");
        int temp = sc.nextInt(); 
        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        //if temp between -15 and 0:
        if (temp >= -15 && temp < 0){
            forecast = "The forecast is FREEZING! Stay home!";
        //if temp between 0 and 10: ;
        } else if (temp >= 0 && temp < 10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        //else: It's warm. go outside!
        } else {
            forecast = "Its warm. Go Outside";
        }
        System.out.println(forecast);
    }
}