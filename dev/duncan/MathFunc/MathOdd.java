package dev.duncan.MathFunc;

public class MathOdd implements MathFunc {

    @Override
    public int MathCounter(int mathNumIn){
        int mathNumOut = 0;
        for (int i = 0 ; i < mathNumIn ; i++){
            if ((i % 2) != 0){
                mathNumOut = mathNumOut + i;
            }
        }
        return mathNumOut;
    }

}
