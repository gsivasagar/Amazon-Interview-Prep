package DSA.s11;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxCap = Integer.MIN_VALUE;
        while (left < right) {

            // System.out.println("left "+left+" right "+right);
            int minVal = Math.min(height[left], height[right]);

            // System.out.println("mc "+maxCap + " mv " + minVal);
            maxCap = Math.max(maxCap, minVal * (right - left));

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxCap;
    }
}
