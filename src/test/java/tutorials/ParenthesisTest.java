package tutorials;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class ParenthesisTest {

    static int n;
    static int count;
    static String string;

    @BeforeClass
    public static void init() {
        n = (int)(Math.random() * 10);
        count = Parenthesis.dynamicCount(n);
        string = Parenthesis.possibleParenthesis(n);
    }

    @Test
    public void parCountTest() {
        int c = 1;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '|') {
                c++;
            }
        }
        assertEquals("The amount of combinations generated wasn't the one expected.", count, c);
    }

    @Test
    public void parCombiTest() {
        boolean isComplete = true;
        int parCount = 0;
        for(int i = 0; i < string.length(); i++) {
            if(parCount < 0) {
                isComplete = false;
            } else if(string.charAt(i) == '(') {
                parCount++;
            } else if(string.charAt(i) == ')') {
                parCount--;
            }
        }
        assertTrue("There was a non valid parenthesis combination.", isComplete);
    }

    @Test
    public void parUniqueTest() {
        boolean isUnique = true;
        int index = 0;
        char charAt;
        String[] array = new String[count];
        for(int i = 0; i < string.length(); i++) {
            charAt = string.charAt(i);
            if(charAt == '|') {
                index++;
            } else if(charAt != ' ') {
                array[index] += charAt;
            }
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    isUnique = false;
                }
            }
        }
        assertTrue("A parenthesis combination appeared more than one time.", isUnique);
    }

}