public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        
        double ftoc1 = fahrenheitToCelsius(noon);
        double ftoc2 = fahrenheitToCelsius(evening);
        double ftoc3 = fahrenheitToCelsius(midnight);

        datosTemperaturas(noon, ftoc1);
        datosTemperaturas(evening, ftoc2);
        datosTemperaturas(midnight, ftoc3);
    }

    //Task 1: Make a function here. See the doc comments below. //
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit -32) * 5/9;
        return celsius;
    }

    public static void datosTemperaturas(double fah, double cel){
        System.out.println("The temperatures are: ");
        System.out.println("F: " + fah);
        System.out.println("C: " + cel);
    }
}