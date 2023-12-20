package dev.duncan.programpractice.dec_12_18_2023;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProgramDeltaTest {
    @Test
    void testNameQuestionMark() {

    }
    @Test
    void testNameQuestionMark2() {
        assertEquals(false, new ProgramDelta().nameQuestionMark(0B1,1));
    }
    @Test
    void testNameQuestionMark3() {
        assertEquals(true, new ProgramDelta().nameQuestionMark(0B01,0));
    }
    @Test
    void testNameQuestionMark4() {
        assertEquals(true, new ProgramDelta().nameQuestionMark(0B01000000101010000000000111101000,3));
    }

}
