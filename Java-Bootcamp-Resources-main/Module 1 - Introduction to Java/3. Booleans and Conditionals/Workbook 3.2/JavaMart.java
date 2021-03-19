public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        //if you have enough money
        if(wallet > toyCar){
            System.out.println("You have enought money to buy it");
        } else {
            System.out.println("Sorry Mate you have only " +wallet +"$");
        }
        
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.
        wallet = wallet - toyCar;
        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 
            if(wallet > nike){
                System.out.println("You have enought money to buy it");
            } else {
                System.out.println("Sorry Mate you have only " +wallet +"$");
            }

        //else: Sorry, I only have <wallet> left.

    }
}