class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(words[i]);
        }
        return result.toString();
    }
}