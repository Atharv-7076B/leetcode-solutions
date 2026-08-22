class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int originalNum = n;
        while (n != 0) {
            int lastdig = n % 10;
            sum += lastdig;
            product *= lastdig;
            n /= 10;
        }
        return originalNum % (sum + product) == 0;
    }
}