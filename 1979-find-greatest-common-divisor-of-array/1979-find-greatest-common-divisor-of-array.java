class Solution {
    public int findGCD(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return gcd(min, max);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
// Arrays.sort(nums);
// int first = nums[0];
// int end = nums[nums.length - 1];
// int gcd = 0;
// if (end == first)
//     return first;
// for (int i = 1; i < end; i++) {
//     if (first % i == 0 && end % i == 0)
//         gcd = i;
// }
// return gcd;