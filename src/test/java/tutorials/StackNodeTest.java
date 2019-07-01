package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for implementation of stacks
 */
public class StackNodeTest {

    StackNode<Integer> tstack;

    @Before
    public void init() {
        tstack = new StackNode<Integer>();
    }

    @Test
    public void constrTest() {
        assertEquals("The default size isn't 0.", 0, tstack.size());
        assertTrue("The stack isn't empty at construction.", tstack.peek() == null);
    }

    @Test
    public void pushTest() {
        tstack.push(5);
        int peek = tstack.peek();
        assertEquals("The first element wasn't added properly.", 5, peek);
        assertEquals("The size wasn't updated for the first element.", 1, tstack.size());
        tstack.push(7);
        peek = tstack.peek();
        assertEquals("The second element wasn't added properly.", 7, peek);
        assertEquals("The size wasn't updated for the second element.", 2, tstack.size());
        while(tstack.size() < 10) {
            tstack.push(3);
        }
        tstack.push(9);
        peek = tstack.peek();
        assertEquals("The element wasn't added properly beyond initial array size.", 9, peek);
        assertEquals("The size wasn't updated after array size update.", 11, tstack.size());
    }
    
    @Test
    public void popTest() {
        tstack.pop();
        assertEquals("The method changed the default size (expected 0).", 0, tstack.size());
        assertTrue("The method changed the default empty element.", tstack.peek() == null);
        tstack.push(5);
        tstack.push(7);
        tstack.pop();
        int peek = tstack.peek();
        assertEquals("The size didn't updated properly after element removal.", 1, tstack.size());
        assertEquals("The element wasn't properly removed.", 5, peek);
    }

}