package DSA.s15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> idx = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            while (j < k) {
                int val = nums[i] + nums[j] + nums[k];
                if (val < 0) {
                    j++;
                } else if (val > 0) {
                    k--;
                } else {
                    idx.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return idx;
    }
}