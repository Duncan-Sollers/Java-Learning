package dev.duncan.programpractice.dec_12_22_2023;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ListTest {
    public String str1 = "Element1";
    @Test
    public void testList(){

    }
    @Test
    public void testNewListIsEmpty(){
        assertEquals(true, new ArrayList<String>().isEmpty());

    }
    @Test
    public void testNewListHasValue(){
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(0,"Element1");
        assertTrue(arrayList.contains("Element1"));

    }
    @Test
    public void testTwoNewListsHaveSameValues(){
        List<String> arrayListA = new ArrayList<String>();
        List<String> arrayListB = new ArrayList<String>();
        arrayListA.add(0,"Element1");
        arrayListA.add(1,"Element2");
        for(int i=0; i<arrayListA.size(); i++ ){
            arrayListB.add(i, arrayListA.get(i));
        }
        assertTrue(arrayListB.contains("Element1"));
        assertTrue(arrayListB.contains("Element2"));
    }
}
