import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * this is the JoptionPane version of this program, utilizing GUI.
 * @author Duncan Sollers
 * @since 02/08/2024
 */

public class ShippingCostsJOptionPaneVersion {
    public static void main(String[] args) {
        //Calc Variables
        double weight = -1.0;
        double itemPrice = -1.0;
        double cost = -1.0;
        double tax = -1.0;
        String itemName = " ";
        
        
        // User Input
        itemName = JOptionPane.showInputDialog("Please enter name of Item:");

        itemPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter price of Item (1$=1.00):"));

        tax = Double.parseDouble(JOptionPane.showInputDialog("Please enter local tax (6% = 0.06):"));

        weight = Double.parseDouble(JOptionPane.showInputDialog("Please Item weight in Pounds (1& half pounds = 1.5):"));

        //Error codes:
        if((weight == 0)||(weight > 25)||(weight < 0))
            if(weight == 0){
                System.out.println("Error 1: Invalid input. \n"+
                "Zero is not valid input\n"+"****************************************");
                System.exit(0);
            }
            if((weight > 25)){
                System.out.println("Error 2: Invalid input. \n"+
                "Weights higher than 25 lbs are too heavy to be shipped\n"+
                "****************************************");
                System.exit(0);
            }
            if(weight < 0){
                System.out.println("Error 3: Invalid input. \n"+
                "Weights less than zero lbs are not valid inputs.\n"+
                "****************************************");
                System.exit(0);
            }

        //Shipping costs Calculator & printout
        if ((weight <= 1) && (weight > 0)){
            cost = 1.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
            System.exit(0);
        }
        if ((weight <= 5) && (weight > 1)){
            cost = 5.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
            System.exit(0);
        }
        if ((weight <= 10) && (weight > 5)){
            cost = 9.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
            System.exit(0);
        }
        if ((weight <= 25) && (weight > 10)){
            cost = 12.99;
            outputFormat(itemName,itemPrice,weight,tax,cost);
            System.exit(0);
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
            //Created OBJS
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

            subTotal = itemPrice + cost;
            total = ((itemPrice + cost)*(tax+1.0));

            JOptionPane.showInputDialog(null,
                                    String.format("****************************************\n"+
                                    "Your Item: "+itemName+"\n"+
                                    "Costs: $"+itemPrice+"\n"+
                                    "Weighs: "+weight+" lbs\n"+
                                    "****************************************"+"\n"+
                                    "Estimated Shipping without taxes: "+cost+"\n"+
                                    "****************************************"+"\n"+
                                    "Subtotal: $"+subTotal+"\nTotal you pay today: "+decimalFormat.format(total)+"\n"+
                                    "****************************************"+
                                    "\n"+"Thank you for shopping with us today!"));
        }// end formatter
    
}
