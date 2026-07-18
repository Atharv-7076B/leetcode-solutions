class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        int end = nums[nums.length - 1];
        int gcd = 0;
        if (end == first)
            return first;
        for (int i = 1; i < end; i++) {
            if (first % i == 0 && end % i == 0)
                gcd = i;
        }
        return gcd;
    }
}