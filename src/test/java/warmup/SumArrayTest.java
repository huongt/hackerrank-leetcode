package warmup;

import algorithsm.warmup.SumArray;
import leetcode.Solution;
import org.junit.Test;

import java.util.Arrays;

public class SumArrayTest {
    private Solution solution = new Solution();
    @Test
    public void miniMaxSumTest() {
        SumArray.miniMaxSum(new int[]{256741038 ,623958417 ,467905213 ,714532089, 938071625});
    }

    @Test
    public void reverseX() {
        System.out.println(Solution.reverse(1534236469));
    }

    @Test
    public void longestPalindrome() {
        System.out.println(solution.longestPalindrome("babad"));
    }
}
