package com.codedifferently;

public class Problem {
    public static Integer characterReplacement(String s, int k){
        int[] charCount = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charCount[currentChar - 'A']++;
            maxCount = Math.max(maxCount, charCount[currentChar - 'A']);

            if (end - start + 1 - maxCount > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
