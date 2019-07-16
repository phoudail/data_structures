package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Arrays;

public class Combinations {

    public static int combiCount(int n, int k) {
        if(k == 1) {
            return n;
        }
        else if(k < 1) {
            throw new InvalidDnDOperationException();
        }
        int result = 0;
        for(int i = 1; i <= n; i++) {
            result += combiCount(n-i, k-1);
        }
        return result;
    }

    public static String possibleCombi(Integer[] n, int k, String prefix) {
        String result = "";
        String basePrefix = prefix;
        if(k == 1) {
            for(int i = 0; i < n.length; i++) {
                result += prefix + n[i] + " | ";
            }
        } else {
            for(int i = 0; i < n.length-k+1; i++) {
                Integer[] array = Arrays.copyOfRange(n, i+1, n.length);
                prefix = basePrefix + n[i];
                result += possibleCombi(array, k-1, prefix);
            }
        }
        return result;
    }

    public static String possibleCombi(Integer[] n, int k) {
        return possibleCombi(n, k, "");
    }
}