package dev.duncan.MathFunc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathDollarCounterTest {
    //assertEquals(EXPECTED_VALUE, ACTUAL_VALUE)
    //ACTUAL_VALUE MEANS THE FUNCTION CALL UNDER TEST
    @Test
    void testOneWeek() {
        MathDollarCounter testDollar = new MathDollarCounter();
        assertEquals(1,testDollar.weekDollarCounter(1));
    }
    @Test
    void testTwoWeeks() {
        MathDollarCounter testDollar = new MathDollarCounter();
        assertEquals(3, testDollar.weekDollarCounter(2));
    }
    @Test
    void testZeroWeeks() {
        MathDollarCounter testDollar = new MathDollarCounter();
        assertEquals(0, testDollar.weekDollarCounter(0));
    }
}
