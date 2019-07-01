package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for a second implementation of Linked Lists.
 */
public class LinkedListv2Test {

    LinkedListv2<Integer> list;

    @Before
    public void init() {
        list = new LinkedListv2<Integer>();
    }
 
    @Test
    public void addTest() {
        list.add(5);
        list.add(7);
        int t = list.get(0);
        int t2 = list.get(1);
        assertEquals("The first value wasn't added.", 5, t);
        assertEquals("The second value wasn't added.", 7, t2);
        assertEquals("The list size didn't update properly.", 2, list.size());
    }

    @Test
    public void sizeTest() {
        assertEquals("The list's size at construction isn't 0.", 0, list.size());
        list.add(7);
        list.add(9);
        list.add(12);
        list.remove(7);
        assertEquals("The list's size doesn't update properly.", 2, list.size());
        LinkedListv2<Integer> list2 = new LinkedListv2<Integer>();
        assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        assertEquals("A new list's size isn't 0.", 0, list2.size());
    } 

    @Test
    public void removeTest() {
        list.remove(4);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        list.add(12);
        list.remove(7);
        boolean t = list.contains(7);
        assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        assertEquals("The list size didn't update properly.", 4, list.size());
        assertTrue("All occurences of the element were removed, not just the first.", t);
        list.remove(9);
        assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        list.remove(5);
        assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        list.remove(12);
        assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }

    @Test
    public void removeAllTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        list.removeAll(7);
        boolean t = list.contains(7);
        assertTrue("Not all occurences of the element were removed.", !t);
        assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        list.get(3);
    }

    @Test
    public void getTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        int t0 = list.get(0);
        int t1 = list.get(1);
        int t2 = list.get(2);
        assertEquals("The first value wasn't properly returned.", 5, t0);
        assertEquals("The second value wasn't properly returned.", 7, t1);
        assertEquals("The last value wasn't properly returned.", 3, t2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        list.set(3, 7);
    }

    @Test
    public void setTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        list.set(1, 9);
        assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }

    @Test
    public void indexOfTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }

    @Test
    public void containsTest() {
        assertTrue("An empty list returned that it contained something.", !list.contains(9));
        list.add(9);
        list.add(7);
        list.add(43);
        assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }

    @Test
    public void isEmptyTest() {
        assertTrue("An empty list was found not empty.", list.isEmpty());
        list.add(5);
        assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }

}