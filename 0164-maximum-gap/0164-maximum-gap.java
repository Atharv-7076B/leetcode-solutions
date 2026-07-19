class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2)
            return 0;
        Arrays.sort(nums);
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(nums[i] - nums[i - 1], maxGap);
        }
        return maxGap;
    }
}