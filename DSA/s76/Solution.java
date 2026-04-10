package DSA.s76;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return new String();
        }
        int count = t.length();
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int start = 0, end = 0, startIdx = 0, minWindow = Integer.MAX_VALUE;
        char[] ch = s.toCharArray();
        while (end < s.length()) {
            // System.out.println("i "+end+" start "+start+" c "+count);
            if (map[ch[end++]]-- > 0) {
                count--;
            }
            while (count == 0) {
                // System.out.println("i "+end+" Start "+start);
                if (end - start < minWindow) {
                    minWindow = end - start;
                    startIdx = start;
                }
                if (map[ch[start++]]++ == 0) {
                    count++;
                }
            }
        }
        // System.out.println(startIdx);
        return minWindow == Integer.MAX_VALUE ? "" : new String(ch, startIdx, minWindow);
    }
}
