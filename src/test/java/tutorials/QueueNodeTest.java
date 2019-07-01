package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class QueueNodeTest {

    QueueNode<Integer> tqueue;

    @Before
    public void init() {
        tqueue = new QueueNode<Integer>();
    }


    @Test
    public void constrTest() {
        assertEquals("", 0, tqueue.size());
        assertTrue("", tqueue.peek() == null);
    }

    @Test
    public void addTest() {
        tqueue.add(5);
        int peek = tqueue.peek();
        assertEquals("The first element wasn't added properly.", 5, peek);
        assertEquals("The size wasn't updated for the first element.", 1, tqueue.size());
        tqueue.add(7);
        peek = tqueue.peek();
        assertEquals("The second element wasn't added properly.", 5, peek);
        assertEquals("The size wasn't updated for the second element.", 2, tqueue.size());
        while(tqueue.size() < 10) {
            tqueue.add(3);
        }
        tqueue.add(9);
        peek = tqueue.peek();
        assertEquals("The elements weren't added properly beyond initial array size.", 5, peek);
        assertEquals("The size wasn't updated after array size update.", 11, tqueue.size());
    }
    
    @Test
    public void removeTest() {
        tqueue.remove();
        assertEquals("The method changed the default size (expected 0).", 0, tqueue.size());
        assertTrue("The method changed the default empty element.", tqueue.peek() == null);
        tqueue.add(5);
        tqueue.add(7);
        tqueue.remove();
        int peek = tqueue.peek();
        assertEquals("The size didn't updated properly after element removal.", 1, tqueue.size());
        assertEquals("The element wasn't properly removed.", 7, peek);
        tqueue.remove();
        assertEquals("The queue size isn't 0 although the only element was removed.", 0, tqueue.size());
        assertTrue("The queue isn't empty after sole element removal.", tqueue.peek() == null);
    }
}