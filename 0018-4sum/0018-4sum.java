class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int left = j + 1;
                int right = n - 1;
                long newTarget = (long) target - nums[i] - nums[j];

                while (left < right) {
                    long sum = (long) nums[left] + nums[right];

                    if (sum < newTarget) {
                        left++;
                    } else if (sum > newTarget) {
                        right--;
                    } else {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        ans.add(list);
                        while (left < right && nums[left] == list.get(2)) {
                            left++;
                        }
                        while (left < right && nums[right] == list.get(3)) {
                            right--;
                        }
                    }
                }
                while (j + 1 < n && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while (i + 1 < n && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return ans;
    }
}