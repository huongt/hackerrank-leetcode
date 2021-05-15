package leetcode.easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] plusDigits = Arrays.copyOf(digits, digits.length);
        return divideStrategy(plusDigits, digits, digits.length - 1);
    }

    private int[] divideStrategy(int[] plusDigits, int[] digits, int i) {
        if (digits[i] + 1 == 10) return redundantPlus(plusDigits, digits, i);
        else return enoughPlus(plusDigits, digits, i);
    }

    private int[] redundantPlus(int[] plusDigits, int[] digits, int i) {
        if (i == 0) {
            int[] finalDigits = Arrays.copyOf(plusDigits, digits.length + 1);
            finalDigits[1] = 0;
            finalDigits[0] = 1;
            return finalDigits;
        }
        plusDigits[i] = 0;
        return divideStrategy(plusDigits, digits, --i);
    }

    private int[] enoughPlus(int[] plusDigits, int[] digits, int i) {
        plusDigits[i] = digits[i] + 1;
       return plusDigits;
    }
}

