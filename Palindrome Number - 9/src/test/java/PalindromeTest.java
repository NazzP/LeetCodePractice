import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void PalindromeCheck() {
        assertTrue(Main.isPalindrome(111));
        assertTrue(Main.isPalindrome(555555));
        assertFalse(Main.isPalindrome(123));
    }
}
