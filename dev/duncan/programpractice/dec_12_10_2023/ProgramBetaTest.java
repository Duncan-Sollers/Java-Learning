package dev.duncan.programpractice.dec_12_10_2023;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProgramBetaTest {
    @Test
    void testSortArrayNumbers() {

    }
    @Test
    void testSortArrayNumbersValidReturn() {
        int array[] = {1};
        //assertEquals(array, new ProgramBeta().sortArrayNumbers(array));
    }
    @Test
    void testSortArrayNumbersShouldSort2_1() {
        int array[] = {2,1};
        new ProgramBeta().sortArrayNumbers(array);
        int first = array[0];
        int second = array[1];
        assertEquals(1, first);
        assertEquals(2, second);
        //assertEquals(array, );
    }

    @Test
    void testSortArrayNumbersShouldSort2_1_3() {
        int array[] = {2,1,3};
        new ProgramBeta().sortArrayNumbers(array);
        int first = array[0];
        int second = array[1];
        int third = array[2];
        assertEquals(1, first);
        assertEquals(2, second);
        assertEquals(3, third);
        //assertEquals(array, );
    }
    @Test
    void testSortArrayNumbersShouldSort22_1_333() {
        int array[] = {22,1,333};
        new ProgramBeta().sortArrayNumbers(array);
        int first = array[0];
        int second = array[1];
        int third = array[2];
        assertEquals(1, first);
        assertEquals(22, second);
        assertEquals(333, third);
        //assertEquals(array, );
    }
    @Test
    void testSortArrayNumbersShouldSort2_2_1() {
        int array[] = {2,2,1};
        new ProgramBeta().sortArrayNumbers(array);
        int first = array[0];
        int second = array[1];
        int third = array[2];
        assertEquals(1, first);
        assertEquals(2, second);
        assertEquals(2, third);
        //assertEquals(array, );
    }
    
}
