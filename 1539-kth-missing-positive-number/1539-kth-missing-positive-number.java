class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int range = arr[arr.length - 1] + k;
        int n = 0;
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; k != 0; i++) {
            if (!set.contains(i)) {
                n = i;
                k--;
            }
        }

        return n;
    }
}