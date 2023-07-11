import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class isValidTest {
    @Test
    public void isValidCheck() {
        assertFalse(Main.isValid("(()]"));
        assertTrue(Main.isValid("()()()[]([])"));
        assertTrue(Main.isValid("{([])}"));
        assertFalse(Main.isValid("{([]})"));
    }
}
