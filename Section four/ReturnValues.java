public class ReturnValues {
    public static void main(String[] args) {
            // Arguments
            double measure1 = measureRectangle(4.3, 2.2, "area");
            double measure2 = measureRectangle(3.2, 4.1, "perimeter");

            stringPrinter(4.3, 2.2, measure1, "area");
            stringPrinter(3.2, 4.1, measure2, "perimetro");


    }
                //return type     Parameters
    public static int funtionName(){
        int pepe = 1;
        return pepe;
    }

    public static double measureRectangle(double lenght, double width, String option){
        if (lenght <0 || width <0){
            System.err.println("Lenght or width cannot be negative");
            System.exit(0);
        }          
            switch(option){
                case "area": return lenght * width;
                case "perimeter": return 2 * (lenght + width);
                default: return 404;
            }
    }

    
    public static void stringPrinter(double lenght, double width, double measure, String option){
        System.out.println("The " +option + " of the rectangle with lenght " + lenght + " and width " + width + " its equal to " + measure);
    }
    

}
