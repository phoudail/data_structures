package tutorials;

public class Palindromes {

    public static int[] coins(int[] currency, int price) {
        int[] coinAmount = new int[currency.length];
        int priceLeft = price;
        for(int i = currency.length-1; i >= 0; i--) {
            if(priceLeft == 0) {
                return coinAmount;
            }
            while(priceLeft - currency[i] >= 0) {
                priceLeft -= currency[i];
                coinAmount[i]++;
            }
        }
        return coinAmount;
    }

    public static String findPalindrome(String word) {
        String result = "";
        for(int i = 0; i < word.length(); i++) {
            for(int j = word.length()-1; j >= i; j--) {
                int k = 0;
                String leftIndex = "";
                String rightIndex = "";
                while(i+k <= j-k && word.charAt(i+k) == word.charAt(j-k)) {
                    if(i+k == j-k) {
                        leftIndex += word.charAt(i+k);
                    } else {
                        leftIndex = leftIndex + word.charAt(i+k);
                        rightIndex = word.charAt(j-k) + rightIndex;
                    }
                    k++;
                }
                if(i+k >= j-k) {
                    String indexResult = leftIndex + rightIndex;
                    if(indexResult.length() > result.length()) {
                        result = indexResult;
                    }
                }
            }
        }
        return result;
    }
}