package dev.duncan.programpractice.dec_12_10_2023;

public class ProgramGamma {
    public boolean palindrone(char charVal[]){
        int leftIndex=0;
        int rightIndex=0;
        for(int i = 0; i < (charVal.length); i++){
            leftIndex = i;
            rightIndex = charVal.length-1-i;
            if (Character.toUpperCase(charVal[leftIndex]) != Character.toUpperCase(charVal[rightIndex])){
                return false;
            }
            
            if (leftIndex >= rightIndex){
                return true;
            }
            
        }
        return false;
        
    }
}
