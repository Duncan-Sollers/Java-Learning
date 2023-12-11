package dev.duncan.programpractice.dec_12_10_2023;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProgramAlphaTest {
    @Test
    void testFizzBuzz() {

    }
    @Test
    void testFizzBuzzOne(){
       assertEquals("1", new ProgramAlpha().fizzBuzz(1));
    }
    @Test
    void   testFizzBuzzTwo(){
        assertEquals("2",new ProgramAlpha().fizzBuzz(2));
    }
    @Test
    void   testFizzBuzzThree(){
        assertEquals("Fizz",new ProgramAlpha().fizzBuzz(3));
    }
    @Test
    void   testFizzBuzzFour(){
        assertEquals("4",new ProgramAlpha().fizzBuzz(4));
    }
    @Test
    void   testFizzBuzzFive(){
        assertEquals("Buzz",new ProgramAlpha().fizzBuzz(5));
    }

    @Test
    void   testFizzBuzzNine(){
        assertEquals("Fizz",new ProgramAlpha().fizzBuzz(9));
    }
    @Test
    void   testFizzBuzz15(){
        assertEquals("FizzBuzz",new ProgramAlpha().fizzBuzz(15));
    }
    @Test
    void   testFizzBuzz30(){
        assertEquals("FizzBuzz",new ProgramAlpha().fizzBuzz(30));
    }

}
