package tutorials;

public class Parenthesis {

    public static int count(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int result = 0;
        for(int i = 0; i <= n-1; i++) {
            result += count(i) * count(n-i-1);
        }
        return result;
    }

    public static int dynamicCount(int n) {
        if(n < 2) { return 1; }
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j <= i-1; j++) {
                array[i] += array[j] * array[i-j-1];
            }
        }
        return array[n];
    }

    public static String possibleParenthesis(int n) {
        String[][] array = new String[n+1][];
        for(int i = 0; i < array.length; i++) {
            array[i] = new String[dynamicCount(i)];
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = "";
            }
        }
        for(int i = 1; i < array.length; i++) {
            int j = 0;
            int k = 0;
            int h = 0;
            int parCount = i - 1;
            while(j < array[i].length) {
                if(h >= array[i-1 - parCount].length) {
                    h = 0;
                    k++;
                }
                if(k >= array[parCount].length) {
                    k = 0;
                    parCount--;
                }
                array[i][j] += "(" + array[parCount][k] + ")" + array[i-1 - parCount][h];
                h++;
                j++;
            }
        }
        return parToString(array[n]);
    }

    private static String parToString(String[] array) {
        String result = array[0];
        for(int i = 1; i < array.length; i++) {
            result += " | " + array[i];
        }
        return result;
    }
        
}