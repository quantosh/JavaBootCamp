public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99,  1.99, 2.49, 1.49, 2.99},
            {8.99,  7.99, 9.49, 9.99, 10.99},
        };

        // Task 2 - Populate your 2D array with values from the table (see article)

        System.out.print("\nBaking: " + prices[0][0] + " " + prices[0][1] + " " + prices[0][2] + " " + prices[0][3] + " " + prices[0][4]);
        System.out.print("\nBeverage: " + prices[1][0] + " " + prices[1][1] + " " + prices[1][2] + " " + prices[1][3] + " " + prices[1][4]);
        System.out.print("\nCereals: " + prices[2][0] + " " + prices[2][1] + " " + prices[2][2] + " " + prices[2][3] + " " + prices[2][4]);

        // Task 3 - Print the prices for each department. See the article for the expected output.  

        for(int i = 0; i < prices.length; i++){
            
            for(int j = 0; j < prices.length; j++){

            }
        }

    }
}