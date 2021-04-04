package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();

    @Test
    public void case1() {
        assertEquals("hhh", palindrome.longestPalindrome("uhhhi"));
    }

    @Test
    public void case2() {
        assertEquals("aba", palindrome.longestPalindrome("ababuy"));
    }

    @Test
    public void case3() {
        assertEquals("aca", palindrome.longestPalindrome("acacuybacac"));
    }

    @Test
    public void case4() {
        assertEquals("aca", palindrome.longestPalindrome("aacabdkacaa"));
    }

    @Test
    public void case5() {
        assertEquals("aaaa", palindrome.longestPalindrome("aaaa"));
    }

    @Test
    public void case6() {
        assertEquals("bb", palindrome.longestPalindrome("bb"));
    }

    @Test
    public void case7() {
        assertEquals("bb", palindrome.longestPalindrome("abb"));
    }

    @Test
    public void case8() {
        assertEquals("a", palindrome.longestPalindrome("a"));
    }

    @Test
    public void case9() {
        assertEquals("a", palindrome.longestPalindrome("ac"));
    }
}
