import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanTest {
    @Test
    public void PalindromeCheck() {
        assertEquals(Main.romanToInt("VI"), 6);
        assertEquals(Main.romanToInt("CM"), 900);
        assertEquals(Main.romanToInt("XXIV"), 24);
    }
}
