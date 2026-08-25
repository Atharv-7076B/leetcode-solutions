class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (i % k == 0) {
                s.add(i);
            }
        }
        for (int i = 1; i <= nums.length + 1; i++) {
            int multiple = i * k;
            if (!s.contains(multiple)) {
                return multiple;
            }
        }
        return -1;
    }
}