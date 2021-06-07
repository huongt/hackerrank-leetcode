package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

public class PlusOneTest {
    private static final PlusOne plusOne = new PlusOne();

    @Test
    public void case1() {
        System.out.print("[1,2,3] => " + Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3}))); 
    }

    @Test
    public void case2() {
        System.out.print("[9,9] => " + Arrays.toString(plusOne.plusOne(new int[]{9,9})));
    }

    @Test
    public void case3() {
        System.out.print("[0] => " + Arrays.toString(plusOne.plusOne(new int[]{0})));
    }

    @Test
    public void case4() {
        System.out.print("[1,2,3,4,5,6,8,9,1,2,3,9,9] => " + Arrays.toString(plusOne.plusOne(new int[]{1,2,3,4,5,6,8,9,1,2,3,9,9})));
    }
}
