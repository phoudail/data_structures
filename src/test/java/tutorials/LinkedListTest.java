package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.beans.BeanProperty;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for implementation of Linked Lists.
 */
public class LinkedListTest {

    LinkedList<Integer> list;

    @Before
    public void init() {
        list = new LinkedList<Integer>();
    }

 
    @Test
    public void addTest() {
        list.add(5);
        list.add(7);
        int t = list.get(0);
        int t2 = list.get(1);
        assertEquals(5, t);
        assertEquals(7, t2);
        assertEquals(2, list.size());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, list.size());
    } 

    @Test
    public void removeTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        list.remove(7);
        boolean t = list.contains(7);
        assertTrue(list.get(1) != 7);
        assertEquals(3, list.size());
        assertTrue(t);
    }

    @Test
    public void removeAllTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        list.removeAll(7);
        boolean t = list.contains(7);
        assertEquals(2, list.size());
        assertTrue(!t);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        int t3 = list.get(3);
    }

    @Test
    public void getTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        int t0 = list.get(0);
        int t1 = list.get(1);
        int t2 = list.get(2);
        assertEquals(5, t0);
        assertEquals(7, t1);
        assertEquals(3, t2);
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
        assertEquals(3, list.size());
        assertEquals(1, list.indexOf(9));
    }

    @Test
    public void indexOfTest() {
        list.add(5);
        list.add(7);
        list.add(3);
        assertEquals(0, list.indexOf(5));
        assertEquals(-1, list.indexOf(9));
    }

    @Test
    public void containsTest() {
        assertTrue(!list.contains(9));
        list.add(9);
        list.add(7);
        list.add(43);
        assertTrue(list.contains(7));
        assertTrue(!list.contains(4));
    }

    @Test
    public void isEmptyTest() {
        assertTrue(list.isEmpty());
        list.add(5);
        assertTrue(!list.isEmpty());
    }

}