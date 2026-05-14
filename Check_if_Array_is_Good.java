class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = 0;

        // Find the max element
        for (int num : nums) {
            max = Math.max(num, max);
        }
        // check if max is less than n-1
        if (max != n - 1)
            return false;
        int[] freq = new int[n];

        for (int num : nums) {
            // check if ele greater then length then return false
            if (num >= n)
                return false;
            freq[num]++;
        }
        // check if the freq of ele is not 1 then return false
        for (int i = 1; i < n - 1; i++) {
            if (freq[i] != 1)
                return false;
        }
        // check if the freq of the n-1 is not 2 then return false
        if (freq[n - 1] != 2)
            return false;
        // Otherwise true
        return true;
    }
}