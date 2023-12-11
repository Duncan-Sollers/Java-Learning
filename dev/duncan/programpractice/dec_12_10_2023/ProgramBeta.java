package dev.duncan.programpractice.dec_12_10_2023;

public class ProgramBeta {
    public void sortArrayNumbers(int testVal[]){
        int arrLength = testVal.length;
        for(int i = 0; i < (arrLength); i++){
            for(int j = 0; j < (arrLength -1); j++){
                if (testVal[j] > testVal[j+1]){
                    int temp = testVal[j];
                    testVal[j] = testVal[j+1];
                    testVal[j+1] = temp;
                }
            }
        }
        
    }
        
}
