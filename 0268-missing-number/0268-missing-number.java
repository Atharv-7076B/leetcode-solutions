class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int expectedSum = len * (len + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}

// int len = nums.length;
// int missVal = 0;
// Arrays.sort(nums);
// for (int i = 0; i < len; i++) {
//     if (nums[i] != i) {
//         missVal = i;
//         return missVal;
//     }
// }
// return len;