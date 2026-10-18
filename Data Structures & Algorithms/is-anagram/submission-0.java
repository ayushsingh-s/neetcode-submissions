class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str = s.toCharArray();
        char[] arr = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(arr);
        return Arrays.equals(str, arr);
    }
}
