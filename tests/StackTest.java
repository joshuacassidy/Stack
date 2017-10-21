import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }


    @Test
    public void pop() throws Exception {
        assertEquals(3, (int) stack.pop());
    }

    @Test
    public void peek() throws Exception {
        assertEquals(3,(int) stack.peek());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals(3,stack.getSize());
    }

    @Test
    public void stackIsNotEmptyWhenPopulated() throws Exception {
        assertEquals(false,stack.isEmpty());
    }

    @Test
    public void stackIsEmptyWhenCreated() throws Exception {

        assertEquals(true,new Stack<>().isEmpty());
    }

    @Test
    public void stackSupportsStrings() throws Exception {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        assertEquals("1",  stack.peek());

    }

    @Test
    public void stackSupportsBooleans() throws Exception {
        Stack<Boolean> stack = new Stack<>();
        stack.push(true);
        assertEquals(true, stack.peek());

    }

}