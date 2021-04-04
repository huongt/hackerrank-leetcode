package leetcode.medium;

/**
 * Dynamic programming
 **/
public class Palindrome {

    private int maxPalindromeLen = 1;
    private int startInd = 0;
    private int endInd = 1;

    public String longestPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return s;
        for (int i = 1; i <= s.length() - 1; i++) {
            findPalindrome(s, i - 1, i);
            if (i < s.length() - 1) findPalindrome(s, i - 1, i + 1);
        }
        return s.substring(startInd, endInd);
    }

    private void findPalindrome(String s, int start, int end) {
        while (s.charAt(start) == s.charAt(end)) {
            int len = end - start + 1;
            if (len > maxPalindromeLen) {
                maxPalindromeLen = len;
                startInd = start;
                endInd = end + 1;
            }
            if (start > 0 && end < s.length() - 1) {
                start--;
                end++;
            } else break;
        }
    }
}
