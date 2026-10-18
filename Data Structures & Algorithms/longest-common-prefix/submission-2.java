class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int j = 0;
        for (int i = 1; i < strs.length; i++) {
            while (j < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j);
            j=0;
        }
        return prefix;
    }
}