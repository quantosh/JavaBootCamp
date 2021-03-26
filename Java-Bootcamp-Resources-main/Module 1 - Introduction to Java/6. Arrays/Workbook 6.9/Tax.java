import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */
        double[] afterTax = new double[4];
         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */
        for (int i = 0; i < price.length; i++){
            afterTax[i] = price[i] * 1.13;
        }
         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */
           System.out.print("The original prices are: " + Arrays.toString(price));
           System.out.print("\nThe prices after tax are: " + Arrays.toString(afterTax));

    }
}
