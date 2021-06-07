package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void case1() {
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void case2() {
        assertEquals(5, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    public void case3() {
        assertEquals(0, removeElement.removeElement(new int[]{1}, 1));
    }

    @Test
    public void case4() {
        assertEquals(0, removeElement.removeElement(new int[]{1, 1, 1, 1}, 1));
    }

    @Test
    public void case5() {
        assertEquals(1, removeElement.removeElement(new int[]{1, 1, 6, 1}, 1));
    }

    @Test
    public void case6() {
        assertEquals(1, removeElement.removeElement(new int[]{2}, 1));
    }
}
