public class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] div = new int[word.length()];
        long remainder = 0;
        for (int i = 0; i < word.length(); i++) {
            long curNum = remainder * 10 + (word.charAt(i) - '0');
            if (curNum % m == 0) {
                div[i] = 1;
                remainder = 0;
            } else {
                remainder = curNum % m;
            }
        }

        return div;
    }
}