package tutorials;

import java.awt.dnd.InvalidDnDOperationException;

public class Permutations {

    public static int permuCount(int n) {
        if(n == 1 || n == 0) {
            return 1;
        } else if (n < 0) {
            throw new InvalidDnDOperationException();
        }
        return n * permuCount(n-1);
    }

    public static String possiblePermutations(Integer[] n, String prefix) {
        String result = "";
        String basePrefix = prefix;
        if(n.length == 1) {
            return prefix + n[0].toString() + " ";
        }
        for(int i = 0; i < n.length; i++) {
            Integer[] array = new Integer[n.length-1];
            int k = 0;
            for(int j = 0; j < n.length; j++) {
                if(j != i) {
                    array[k] = n[j];
                    k++;
                }
            }
            prefix = basePrefix + n[i];
            result += possiblePermutations(array, prefix);
        }
        return result;
    }

    public static String possiblePermutations(Integer[] n) {
        return possiblePermutations(n, "");
    }

    public static void print(int[] items) {
        System.out.print("{");
        for(int i = 0; i < items.length - 1; i++) {
            System.out.print(items[i]);
            System.out.print(",");
        }
        if(items.length > 0) {
            System.out.print(items[items.length - 1]);
        }
        System.out.println("}");
    }

    public static void permutations(int n) {
        permutations(new boolean[n], new int[n], 0);
    }

    public static void permutations(boolean[] used, int[] permutation, int position) {
        if(position >= used.length) {
            print(permutation);
        }
        else {
            for(int i = 0; i < used.length; i++) {
                if(!used[i]) {
                    used[i] = true;
                    permutation[position] = i + 1;
                    permutations(used, permutation, position + 1);
                    permutation[position] = 0; //
                    used[i] = false;
                }
            }
        }
    }
}
