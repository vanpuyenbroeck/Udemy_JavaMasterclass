package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @Test
    void isPallindrome() {
        assertTrue(NumberPalindrome.isPalindrome(-1221));
    }
}