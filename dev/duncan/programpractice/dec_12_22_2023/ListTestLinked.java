package dev.duncan.programpractice.dec_12_22_2023;


//Test imports:
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//List imports:
import java.util.LinkedList;
import java.util.Comparator;
import java.util.List;

public class ListTestLinked {
    
    public String str1 = "Element1";
    @Test
    public void testList(){

    }
    @Test
    public void testNewListIsEmpty(){

        assertEquals(true, new LinkedList<String>().isEmpty());

    }
    @Test
    public void testNewListHasValue(){

        List<String> List = new LinkedList<String>();

        List.add(0,"Element1");

        assertTrue(List.contains("Element1"));

    }
    @Test
    public void testTwoNewListsHaveSameValues(){

        List<String> ListA = new LinkedList<String>();
        List<String> ListB = new LinkedList<String>();

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

        List<String> ListA = new LinkedList<String>();
        List<String> ListB = new LinkedList<String>();

        ListA.add(0,"Element1");
        ListA.add(1,"Element2");
        
        ListB.addAll(ListA);    
        
        assertTrue(ListB.contains("Element1"));
        assertTrue(ListB.contains("Element2"));
    }

    @Test
    public void testTwoNewListHaveSimilarValuesButOneAdditionalElementInListB(){

        List<String> ListA = new LinkedList<String>();
        List<String> ListB = new LinkedList<String>();

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

        List<String> testList = new LinkedList<String>();

        testList.add(0,"Element1");
        testList.remove(0);

        assertTrue(testList.isEmpty());
    }

    @Test
    public void testList_WasItRemovedObject(){

        List<String> testList = new LinkedList<String>();

        testList.add(0,"Element1");
        testList.remove("Element1");

        assertFalse(testList.contains("Element1"));
    }

    @Test
    public void testList_WasItRemoved_ListADeleted(){

        List<String> ListA = new LinkedList<String>();
        List<String> ListB = new LinkedList<String>();

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

        List<String> ListA = new LinkedList<String>();
        List<String> ListB = new LinkedList<String>();

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

        List<String> listC = new LinkedList<String>();

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
        
        List<String> listC = new LinkedList<String>();

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
        
        List<String> listC = new LinkedList<String>();

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
        
        List<Integer> listC = new LinkedList<Integer>();

        listC.add(Integer.valueOf(26));
        listC.add(Integer.valueOf(2));
        listC.add(Integer.valueOf(11));
        listC.add(Integer.valueOf(3));
        listC.add(Integer.valueOf(1));

        listC.sort(new IntegerComparator());
        
        assertEquals(Integer.valueOf(1),listC.get(0));
        assertEquals(Integer.valueOf(2),listC.get(1));
        assertEquals(Integer.valueOf(3),listC.get(2));
        assertEquals(Integer.valueOf(11),listC.get(3));
        assertEquals(Integer.valueOf(26),listC.get(4));
    
        


    }
    @Test
    public void testList_SortInteger2(){
        
        List<Integer> listC = new LinkedList<Integer>();

        listC.add(Integer.valueOf(26));
        listC.add(Integer.valueOf(2));
        listC.add(Integer.valueOf(11));
        listC.add(Integer.valueOf(3));
        listC.add(Integer.valueOf(1));

        Comparator<Integer> myComparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer lhs, Integer rhs) {
                return lhs.compareTo(rhs);
            }
        };
        listC.sort(myComparator);
        
        assertEquals(Integer.valueOf(1),listC.get(0));
        assertEquals(Integer.valueOf(2),listC.get(1));
        assertEquals(Integer.valueOf(3),listC.get(2));
        assertEquals(Integer.valueOf(11),listC.get(3));
        assertEquals(Integer.valueOf(26),listC.get(4));
    
        


    }







}
