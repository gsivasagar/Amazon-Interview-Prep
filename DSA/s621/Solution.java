package DSA.s621;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int[] alpha = new int[26];

        for (char task : tasks) {
            alpha[task - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > 0) {
                pq.add(alpha[i]);
            }
        }
        System.out.println(pq);
        int ans = 0;
        while (!pq.isEmpty()) {
            int taskCycle = 0;
            int cycle = n + 1;
            ArrayList<Integer> list = new ArrayList<>();
            while (cycle > 0 && !pq.isEmpty()) {
                int currTask = pq.poll();
                if (currTask > 1) {
                    list.add(currTask - 1);
                }
                taskCycle++;
                cycle--;
            }
            for (int i : list) {
                pq.add(i);
            }
            ans += pq.isEmpty() ? taskCycle : n + 1;
            System.out.println(list);
        }
        return ans;
    }
}