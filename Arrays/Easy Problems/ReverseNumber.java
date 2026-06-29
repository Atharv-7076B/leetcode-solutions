class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverseNumber(nums, 0, n - 1);
        reverseNumber(nums, 0, k - 1);
        reverseNumber(nums, k, n - 1);

    }

    public void reverseNumber(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}