class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (i % k == 0) {
                s.add(i);
            }
        }
        for (int i = 1; i <= nums.length + 1; i++) {
            int m = i * k;
            if (!s.contains(m)) {
                return m;
            }
        }
        return -1;
    }
}