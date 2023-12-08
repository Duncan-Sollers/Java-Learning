package dev.duncan.MathFunc;
//This is for calculating my dads save a dollar thing
public class MathDollarCounter {
    public int weekDollarCounter(int weekIn){
        int dollarSum = 0;
        for (int i = 0 ; i < weekIn ; i++){
            dollarSum = dollarSum + (i + 1);
        }
        System.out.println("Weeks : " + weekIn + "\nDollars Saved: " + dollarSum);
        return dollarSum;
    }
}
