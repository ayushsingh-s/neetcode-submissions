class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ss = new String(arr);
            res.putIfAbsent(ss, new ArrayList<>());
            res.get(ss).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
