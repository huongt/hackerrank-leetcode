package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        while (start < nums.length && end >= 0) {
            if (start == end) break;
            if (nums[start] == val) {
                if (nums[end] == val) end--;
                nums[start] = nums[end];
                nums[end] = val;
                end--;
            }
            start++;
        }
        int result = end + 1;
        if (nums.length == 1 && nums[0] == val) result = 0;
        System.out.printf("Length: %d, %s%n", result, Arrays.toString(nums));
        return result;
    }
}
