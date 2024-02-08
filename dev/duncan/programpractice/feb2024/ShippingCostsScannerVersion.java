import java.util.Scanner;
/**
 * this is the scanner version of this program, utilizing the terminal.
 * @author Duncan Sollers
 * @since 02/08/2024
 */
public class ShippingCostsScannerVersion {
    public static void main(String[] args) {
        //Calc Variables
        double weight = -1.0;
        double itemPrice = -1.0;
        double cost = -1.0;
        double tax = -1.0;
        String itemName = " ";

        // Created OBJS
        Scanner input = new Scanner(System.in);
        
        // User Input
        System.out.println("Please enter name of Item:");
        itemName = input.nextLine();

        System.out.println("Please enter price of Item (1$=1.00):");
        itemPrice = input.nextFloat();

        System.out.println("Please enter local tax (6% = 0.06):");
        tax = input.nextFloat();

        System.out.println("Please Item weight in Pounds (1 & half pounds = 1.5):");
        weight = input.nextFloat();
        input.close();

        //Error codes:
        if((weight == 0)||(weight > 25)||(weight < 0))
            if(weight == 0){
                System.out.println("Error 1: Invalid input. \n"+
                "Zero is not valid inputs\n"+"****************************************");
                System.exit(0);
            }
            if((weight > 25)){
                System.out.println("Error 2: Invalid input. \n"+
                "Numbers  larger than 25 are too heavy to be shipped\n"+
                "****************************************");
                System.exit(0);
            }
            if(weight < 0){
                System.out.println("Error 3: Invalid input. \n"+
                "Numbers less than zero are not valid inputs.\n"+
                "****************************************");
                System.exit(0);
            }

        //Shipping costs Calculator & printout
        if ((weight <= 1) && (weight > 0)){
            cost = 1.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
            
        }
        if ((weight <= 5) && (weight > 1)){
            cost = 5.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
        }
        if ((weight <= 10) && (weight > 5)){
            cost = 9.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
        }
        if ((weight <= 25) && (weight > 10)){
            cost = 12.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
        }
    }// end main

    public static void outputFormat(String itemNameIn, double itemPriceIn, double weightIn, double taxIn, double costIn){
        String itemName = itemNameIn;
        double itemPrice = itemPriceIn;
        double weight = weightIn;
        double tax = taxIn;
        double cost = costIn;
        
        double subTotal = -1.0;
        double total = -1.0;

        subTotal = itemPrice + cost;
        total = ((itemPrice + cost)*(tax+1.0));
        System.out.println("****************************************\n"+
        "Your Item: "+itemName+"\n"+
        "Costs: $"+itemPrice+"\n"+
        "Weighs: "+weight+" lbs\n"+
        "****************************************"+"\n"+
        "Estimated Shipping without taxes: "+cost+"\n"+
        "****************************************"+"\n"+
        "Subtotal: $"+subTotal+"\n");
        System.out.printf("Total you pay today: $%.2f",total);
        System.out.println("\n"+"****************************************"+
        "\n"+"Thank you for shopping with us today!");
    }// end formatter
    
}//end class
