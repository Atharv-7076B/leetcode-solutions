class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int missVal = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] != i) {
                missVal = i;
                return missVal;
            }
        }
        return len;
    }
}