package io.zipcoder;

public class Problem4 {
    static final int NO_OF_CHARS = 256;
    static boolean canFormPalindrome(String str) {
        // Create a count array and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];

        // For each character in input strings,
        // increment count in the corresponding count array
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) != 0)
                odd++;

            if (odd > 1)
                return false;
        }

        // Return true if odd count is 0 or 1,
        return true;
    }
}
