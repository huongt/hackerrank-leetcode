package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static int reverse(int x) {
        int abs = Math.abs(x);
        StringBuilder absStr = new StringBuilder(String.valueOf(abs)).reverse();
        int absReverseX = 0;
        try {
            absReverseX = Integer.parseInt(absStr.toString());
        } catch (NumberFormatException ignored) {
        }
        return x < 0 ? -absReverseX : absReverseX;
    }

    public String longestPalindrome(String s) {
        List<String> origin = Arrays.asList(s.split(""));
        Map<String, Long> repeatChar = new HashMap<>();
        for (String word : new HashSet<>(origin)) {
            long count = origin.stream().filter(e -> e.equals(word)).count();
            if (count > 1) repeatChar.put(word, count);
        }
        if (repeatChar.isEmpty()) return origin.get(0);
        Set<String> subPalindrome = findSubPalindrome(repeatChar, origin, s);
        int longestTemp = 0;
        String finalWord = origin.get(0);
        for (String word : subPalindrome) {
            if (longestTemp < word.length()) {
                longestTemp = word.length();
                finalWord = word;
            }
        }
        return finalWord;
    }

    private Set<String> findSubPalindrome(Map<String, Long> repeatChar, List<String> origin, String s) {
        Set<String> subPalindrome = new HashSet<>();
        for (String word : repeatChar.keySet()) {
            int firstIndex = origin.indexOf(word);
            int lastInd = origin.lastIndexOf(word);
            int i = firstIndex + 1;
            int j = lastInd - 1;
            while (j - i >= 0) {
                if (j == i) subPalindrome.add(s.substring(firstIndex, lastInd + 1));
                if (origin.get(i).equals(origin.get(j))) {
                    j--;
                    i++;
                } else break;
            }
        }
        return subPalindrome;
    }
}
