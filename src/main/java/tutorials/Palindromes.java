package tutorials;

import java.util.Arrays;

public class Palindromes {

    public static int[] coins(int[] currency, int price) {
        // int[] coinAmount = new int[currency.length];
        // int priceLeft = price;
        // for(int i = currency.length-1; i >= 0; i--) {
        //     if(priceLeft == 0) {
        //         return coinAmount;
        //     }
        //     while(priceLeft - currency[i] >= 0) {
        //         priceLeft -= currency[i];
        //         coinAmount[i]++;
        //     }
        // }
        // return coinAmount;
        return coins(currency, price, new int[currency.length], currency.length-1);
    }

    private static int[] coins(int[] currency, int price, int[] money, int coinType) {
        if(coinType == 0) {
            while(price > 0) {
                price -= currency[0];
                money[0]++;
            }
            return money;
        }
        if(price - currency[coinType] < 0) {
            return coins(currency, price, money, coinType-1);
        }
        int[] moneyInc = Arrays.copyOf(money, money.length);
        moneyInc[coinType]++;
        return minArray(coins(currency, price, money, coinType-1), coins(currency, price-currency[coinType], moneyInc, coinType));
    }

    private static int[] minArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        if(sum1 <= sum2) {
            return arr1;
        }
        return arr2;
    }

    public static String findPalindrome(String word) {
        // String result = "";
        // for(int i = 0; i < word.length(); i++) {
        //     for(int j = word.length()-1; j >= i; j--) {
        //         int k = 0;
        //         String leftIndex = "";
        //         String rightIndex = "";
        //         while(i+k <= j-k && word.charAt(i+k) == word.charAt(j-k)) {
        //             if(i+k == j-k) {
        //                 leftIndex += word.charAt(i+k);
        //             } else {
        //                 leftIndex = leftIndex + word.charAt(i+k);
        //                 rightIndex = word.charAt(j-k) + rightIndex;
        //             }
        //             k++;
        //         }
        //         if(i+k >= j-k) {
        //             String indexResult = leftIndex + rightIndex;
        //             if(indexResult.length() > result.length()) {
        //                 result = indexResult;
        //             }
        //         }
        //     }
        // }
        // return result;
        int len = word.length();
        if(len == 1 || len == 0 || isPalindrome(word)) {
            return word;
        }
        String leftWord = "" + word.charAt(0);
        String rightWord = "";
        for(int i = 1; i < len-1; i++) {
            leftWord += word.charAt(i);
            rightWord += word.charAt(i);
        }
        rightWord += word.charAt(len-1);
        return maxString(findPalindrome(leftWord), findPalindrome(rightWord));
    }

    private static String maxString(String str1, String str2) {
        if(str1.length() >= str2.length()) {
            return str1;
        }
        return str2;
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();
        if(len == 1 || len == 0) {
            return true;
        }
        if(word.charAt(0) == word.charAt(len-1)) {
            String newWord = "";
            for(int i = 1; i < len-1; i++) {
                newWord += word.charAt(i);
            }
            return isPalindrome(newWord);
        }
        return false;
    }

    public static String makePalindrome(String word) {
        
    }

}