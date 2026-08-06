class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int dup_num = 0;
        int miss_number = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                dup_num = num;
            } else {
                set.add(num);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                miss_number = i;
            }
        }

        int[] ans = new int[] { dup_num, miss_number };
        return ans;
    }
}