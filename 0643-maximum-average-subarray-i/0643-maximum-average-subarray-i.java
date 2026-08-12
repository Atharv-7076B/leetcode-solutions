class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int windowSize = k;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = 0;
        maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }
        maxAvg = (double) maxSum / k;
        return maxAvg;
    }
}