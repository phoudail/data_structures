package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;
import org.junit.Before;

public class HashTableTest {

    HashTable<String, Integer> t;

    @Before
    public void init() {
        t = new HashTable<String, Integer>();
    }

    @Test
    public void putEmptyTest() {
        t.put("Test", 37);
        assertTrue("The key wasn't added properly to an empty table.", t.contains("Test"));
        int get = t.get("Test");
        assertEquals("The function 'get' returned an unexpected value after adding an element to an empty table.", 37, get);
    }

    @Test
    public void putAddTest() {
        t.put("test1", 37);
        t.put("test2", 86);
        t.put("test3", 4);
        assertTrue("The second element wasn't added.", t.contains("test2"));
        assertTrue("The third element wasn't added.", t.contains("test3"));
        int get2 = t.get("test2");
        int get3 = t.get("test3");
        assertEquals("The second element's value isn't properly returned.", 86, get2);
        assertEquals("The third element's value isn't properly returned.", 4, get3);
    }

    @Test
    public void putUpdateTest() {
        t.put("test1", 37);
        t.put("test2", 86);
        t.put("test3", 4);
        t.put("test2", 42);
        assertTrue("The element disappeared instead of being updated.", t.contains("test2"));
        int get = t.get("test2");
        assertEquals("The value of the element wasn't properly updated.", 42, get);
    }

    @Test
    public void rehashTest() {
        for(int i = 0; i < 55; i++) {
            t.put("test" + i, i);
        }
        assertEquals("The table didn't rehash properly", 20, t.arraySize());
        for(int i = 0; i > 55; i++) {
            int tmp = t.get("test" + i);
            assertEquals("Element number " + i + " wasn't rehashed properly.", tmp, i);
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void getExceptTest() {
        t.get("test");
    }

    @Test
    public void containsEmptyTest() {
        assertTrue("The table returned that it contained something although it is empty.", !t.contains("anothertest"));
    }
}