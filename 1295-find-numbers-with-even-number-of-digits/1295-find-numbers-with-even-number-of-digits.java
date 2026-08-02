class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int ctr = 0;
            while (num > 0) {
                ctr++;
                num /= 10;
            }

            if (ctr % 2 == 0)
                ans++;
        }
        return ans;
    }
}