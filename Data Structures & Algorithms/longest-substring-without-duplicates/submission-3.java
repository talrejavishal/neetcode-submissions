class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 1;
        int max = 1;
        if (s == null) {
            return 0;
        }
        if (s.length() < 2) {
            return s.length();
        }
        Set<Character> chars = new HashSet<Character>();
        chars.add(s.charAt(left));
        while (right < s.length()) {
            while (chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(left));
                left = left + 1;
            }
            chars.add(s.charAt(right));
            max=Math.max(max,right-left+1);
            right=right+1;
        }
        return max;
    }
}
//dvd l=0, r=1, max=1, set [d]
//dvd l=0, r=2, max=2, set [d,v]
//dvd l=1, r=2, max=2, set [v,d]
