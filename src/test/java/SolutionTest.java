import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void divisibilityArrayTest1() {
        String word = "998244353";
        int m = 3;
        int[] expected = {1, 1, 0, 0, 0, 1, 1, 0, 0};
        int[] actual = new Solution().divisibilityArray(word, m);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void divisibilityArrayTest2() {
        String word = "1010";
        int m = 10;
        int[] expected = {0, 1, 0, 1};
        int[] actual = new Solution().divisibilityArray(word, m);

        Assert.assertArrayEquals(expected, actual);
    }
}
