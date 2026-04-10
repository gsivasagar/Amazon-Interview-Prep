package DSA.s239;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> queueWindow = new ArrayDeque<>();
        int[] result = new int[n - k + 1];
        if (n == 0 || k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }
        for (int i = 0; i < n; i++) {

            int val = nums[i];
            if (!queueWindow.isEmpty() && queueWindow.peekFirst() <= i - k) {
                queueWindow.pollFirst();
            }

            while (!queueWindow.isEmpty() && nums[queueWindow.peekLast()] < val) {
                queueWindow.pollLast();
            }

            queueWindow.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[queueWindow.peekFirst()];
            }
        }
        return result;
    }
}