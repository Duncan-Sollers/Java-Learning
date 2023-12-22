package dev.duncan.programpractice.dec_12_22_2023;

//Test imports:
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//List imports:
import java.util.ArrayList;
import java.util.List;

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

        List<String> List = new ArrayList<String>();

        List.add(0,"Element1");

        assertTrue(List.contains("Element1"));

    }
    @Test
    public void testTwoNewListsHaveSameValues(){

        List<String> ListA = new ArrayList<String>();
        List<String> ListB = new ArrayList<String>();

        ListA.add(0,"Element1");
        ListA.add(1,"Element2");

        for(int i=0; i<ListA.size(); i++ ){
            ListB.add(i, ListA.get(i));
        }

        assertTrue(ListB.contains("Element1"));
        assertTrue(ListB.contains("Element2"));
    }
    @Test
    public void testTwoNewListsHaveSameValuesImproved(){

        List<String> ListA = new ArrayList<String>();
        List<String> ListB = new ArrayList<String>();

        ListA.add(0,"Element1");
        ListA.add(1,"Element2");
        
        ListB.addAll(ListA);    
        
        assertTrue(ListB.contains("Element1"));
        assertTrue(ListB.contains("Element2"));
    }

    @Test
    public void testTwoNewListHaveSimilarValuesButOneAdditionalElementInListB(){

        List<String> ListA = new ArrayList<String>();
        List<String> ListB = new ArrayList<String>();

        ListA.add(0,"Element1");
        ListA.add(1,"Element2");

        ListB.add(0,"3");
        ListB.addAll(ListA);    
        
        assertEquals("3",ListB.get(0));
        assertEquals("Element1",ListB.get(1));
        assertEquals("Element2",ListB.get(2));
    }

    @Test
    public void testList_WasItRemovedIndex(){

        List<String> testList = new ArrayList<String>();

        testList.add(0,"Element1");
        testList.remove(0);

        assertTrue(testList.isEmpty());
    }

    @Test
    public void testList_WasItRemovedObject(){

        List<String> testList = new ArrayList<String>();

        testList.add(0,"Element1");
        testList.remove("Element1");

        assertFalse(testList.contains("Element1"));
    }

    @Test
    public void testList_WasItRemoved_ListADeleted(){

        List<String> ListA = new ArrayList<String>();
        List<String> ListB = new ArrayList<String>();

        ListA.add(0,"Element1");
        ListA.add(1,"Element2");

        ListB.add(0,"3");
        ListB.addAll(ListA);
        ListB.removeAll(ListA);

        
        assertEquals("3",ListB.get(0));
        assertEquals(false, ListB.contains("Element1"));
        assertEquals(false, ListB.contains("Element2"));
        
        
    }




}
