package leetcode.easy;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Ignore
public class DeckCardsTest {
    private final DeckCards deckCards = new DeckCards();

    @Test
    public void case1() {
        assertTrue(deckCards.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
    }

    @Test
    public void case2() {
        assertFalse(deckCards.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
    }

    @Test
    public void case3() {
        assertFalse(deckCards.hasGroupsSizeX(new int[]{1}));
    }

    @Test
    public void case4() {
        assertTrue(deckCards.hasGroupsSizeX(new int[]{1, 1}));
    }

    @Test
    public void case5() {
        assertTrue(deckCards.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
    }

    @Test
    public void case6() {
        assertTrue(deckCards.hasGroupsSizeX(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}));
    }

    @Test
    public void case7() {
        assertTrue(deckCards.hasGroupsSizeX(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void case8() {
        assertTrue(deckCards.hasGroupsSizeX(new int[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3}));
    }
}
