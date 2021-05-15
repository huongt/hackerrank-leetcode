package leetcode.easy;

import lombok.extern.java.Log;
import org.junit.Test;

import java.util.Arrays;

@Log
public class PlusOneTest {
    private static final PlusOne plusOne = new PlusOne();

    @Test
    public void case1() {
        log.info("[1,2,3] => " + Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3})));
    }

    @Test
    public void case2() {
        log.info("[9,9] => " + Arrays.toString(plusOne.plusOne(new int[]{9,9})));
    }

    @Test
    public void case3() {
        log.info("[0] => " + Arrays.toString(plusOne.plusOne(new int[]{0})));
    }

    @Test
    public void case4() {
        log.info("[1,2,3,4,5,6,8,9,1,2,3,9,9] => " + Arrays.toString(plusOne.plusOne(new int[]{1,2,3,4,5,6,8,9,1,2,3,9,9})));
    }
}
