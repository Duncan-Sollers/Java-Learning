package dev.duncan.programpractice.jan_1_6_2024;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SSNInfoTest {
    @Test
    void testAddSSNRecord() {
        SSNInfo ssnInfo = new SSNInfo();
        ssnInfo.addSSNRecord(1, "John");
        assertEquals(false, ssnInfo.hasNoValues());
    }

    @Test
    void testRemoveSSNRecord() {
        SSNInfo ssnInfo = new SSNInfo();
        ssnInfo.addSSNRecord(1, "John");
        ssnInfo.removeSSNRecord(1, "John");
        assertEquals(true, ssnInfo.hasNoValues());
    }

    @Test
    void testReplaceSSNRecord() {
        SSNInfo ssnInfo = new SSNInfo();
        ssnInfo.addSSNRecord(1, "John");
        ssnInfo.replaceSSNRecord(1, "John", "Jim");
        assertEquals("Jim", ssnInfo.getValue(1));
    }
}
