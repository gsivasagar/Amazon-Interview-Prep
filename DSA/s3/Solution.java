package DSA.s3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int queueResult = queueMethod(s);
        int setResult = setMethod(s);
        return setResult;
    }

    private int setMethod(String s) {
        // O(n)
        int maxLength = 0, start = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    private int queueMethod(String s) {
        // O(n*k)-> O(n^2)
        int max = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!queue.contains(s.charAt(i))) {
                queue.add(s.charAt(i));
                max = Math.max(max, queue.size());
            } else {
                while (queue.contains(s.charAt(i))) {
                    queue.poll();
                }
                queue.add(s.charAt(i));
            }
        }
        return max;
    }
}