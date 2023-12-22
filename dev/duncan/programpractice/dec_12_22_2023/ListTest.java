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
        assertEquals(1, ListB.size());

    }

    @Test
    public void testList_Retains(){

        List<String> ListA = new ArrayList<String>();
        List<String> ListB = new ArrayList<String>();

        ListA.add(0,"Element1");
        ListA.add(1,"Element2");

        ListB.add(0,"3");
        ListB.addAll(ListA);
        ListB.retainAll(ListA);

        
        assertEquals(false,ListB.contains("3"));
        assertEquals(true, ListB.contains("Element1"));
        assertEquals(true, ListB.contains("Element2"));
        assertEquals(2, ListB.size());

    }

    @Test
    public void testList_Sort(){

        List<String> listC = new ArrayList<String>();

        listC.add("z");
        listC.add("b");
        listC.add("k");
        listC.add("c");
        listC.add("a");

        listC.sort(null);
        
        assertEquals("a",listC.get(0));
        assertEquals("b",listC.get(1));
        assertEquals("c",listC.get(2));
        assertEquals("k",listC.get(3));
        assertEquals("z",listC.get(4));
    
        


    }

    @Test
    public void testList_Sort1(){
        
        List<String> listC = new ArrayList<String>();

        listC.add("z");
        listC.add("b");
        listC.add("k");
        listC.add("c");
        listC.add("a");

        listC.sort(new StringComparator());
        
        assertEquals("a",listC.get(0));
        assertEquals("b",listC.get(1));
        assertEquals("c",listC.get(2));
        assertEquals("k",listC.get(3));
        assertEquals("z",listC.get(4));
    
        


    }
    @Test
    public void testList_SortReverse(){
        
        List<String> listC = new ArrayList<String>();

        listC.add("z");
        listC.add("b");
        listC.add("k");
        listC.add("c");
        listC.add("a");

        listC.sort(new ReverseStringComparator());
        
        assertEquals("a",listC.get(4));
        assertEquals("b",listC.get(3));
        assertEquals("c",listC.get(2));
        assertEquals("k",listC.get(1));
        assertEquals("z",listC.get(0));
    
        


    }
    @Test
    public void testList_SortInteger(){
        
        List<Integer> listC = new ArrayList<Integer>();

        listC.add(26);
        listC.add(2);
        listC.add(11);
        listC.add(3);
        listC.add(1);

        listC.sort(new IntegerComparator());
        
        assertEquals(0,listC.get(0));
        assertEquals(1,listC.get(1));
        assertEquals(2,listC.get(2));
        assertEquals(3,listC.get(3));
        assertEquals(4,listC.get(4));
    
        


    }







}
