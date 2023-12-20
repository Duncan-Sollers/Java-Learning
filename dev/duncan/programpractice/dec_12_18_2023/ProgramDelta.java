package dev.duncan.programpractice.dec_12_18_2023;

public class ProgramDelta {
    public boolean nameQuestionMark(int binValueToTest, int bitPlaceToTest){
        if (binValueToTest>=0){
            
            boolean result = (binValueToTest & (1 << bitPlaceToTest)) > 0;
            return result;
            
        }
        else {
            System.out.println("Invalid Input");
            return false; 
        }
        


    }
}
