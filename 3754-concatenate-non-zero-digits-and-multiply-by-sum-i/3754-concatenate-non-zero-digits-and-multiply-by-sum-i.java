class Solution {
    public long sumAndMultiply(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        long res = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') {
                int digit = arr[i] - '0';
                res = res * 10 + digit;
                sum += digit;
            }
        }
        res *= sum;
        return res;
    }
}