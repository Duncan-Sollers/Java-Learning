package dev.duncan.programpractice.dec_12_10_2023 ;

public class ProgramAlpha {
    public String fizzBuzz(int numIn){
        String fizzBuzzString = "";
        if ((numIn % 3 == 0)||(numIn % 5 == 0)) {
            if (numIn % 3 == 0) {
            fizzBuzzString = fizzBuzzString + "Fizz";
            }
            if (numIn % 5 == 0) {
                fizzBuzzString = fizzBuzzString + "Buzz";
            }
        }  
        else{
           fizzBuzzString = fizzBuzzString + "" + numIn;
        }
        return fizzBuzzString;
    }

    public void loopFizzBuzz(int repCount){
        for (int i=0 ; i <= repCount ; i++){
            System.out.println(fizzBuzz(i) + " ");
        }
    }

}