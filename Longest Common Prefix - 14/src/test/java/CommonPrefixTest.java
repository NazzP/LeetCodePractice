import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommonPrefixTest {
    @Test
    public void longestCommonPrefixTest() {
        String[] strings1 = {"apple", "apps" , "application"};
        String[] strings2 = {"dog", "cat" , "bird"};

        assertEquals(Main.longestCommonPrefix(strings1), "app");
        assertEquals(Main.longestCommonPrefix(strings2), "");
    }
}
