package dev.duncan.MathFunc;
//This is for calculating my dads save a dollar thing
public class MathDollarCounter {
    public void weekDollarCounter(int weekIn){
        int dollarSum = 1;
        for (int i = 1 ; i < weekIn ; i++){
            dollarSum = dollarSum + i +1;
        }
        System.out.println("Weeks : " + weekIn + "\nDollars Saved: " + dollarSum);
    }
}
