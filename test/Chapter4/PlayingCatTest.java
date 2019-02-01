package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @Test
    void isCatPlaying() {
        assertFalse(PlayingCat.isCatPlaying(true,10));
    }

    @Test
    void isCatPlaying1() {
        assertFalse(PlayingCat.isCatPlaying(false,36));
    }

    @Test
    void isCatPlaying2() {
        assertTrue(PlayingCat.isCatPlaying(false,35));
    }

    @Test
    void isCatPlaying3() {
        assertTrue(PlayingCat.isCatPlaying(true,45));
    }
}