package dev.duncan.programpractice.dec_12_10_2023;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProgramGammaTest {
    @Test
    void testPalindrone() {

    }
    @Test
    void testPalindroneTEST() {
        char array[] = {'a'};
        boolean result = new ProgramGamma().palindrone(array);
        assertTrue(result);
    }
    @Test
    void testPalindroneTwoA() {
        char array[] = {'a','a'};
        boolean result = new ProgramGamma().palindrone(array);
        assertTrue(result);
    }
    @Test
    void testPalindroneOneAOneB() {
        char array[] = {'a','b'};
        boolean result = new ProgramGamma().palindrone(array);
        assertTrue(!result);
    }

    @Test
    void testPalindroneABA() {
        char array[] = {'a','b', 'a'};
        boolean result = new ProgramGamma().palindrone(array);
        assertTrue(result);
    }
    @Test
    void testPalindroneABBA() {
        char array[] = {'a','b','b', 'a'};
        boolean result = new ProgramGamma().palindrone(array);
        assertTrue(result);
    }
    @Test
    void testPalindroneAbBA() {
        char array[] = {'a','B','b', 'a'};
        boolean result = new ProgramGamma().palindrone(array);
        assertTrue(result);
    }
   

}
