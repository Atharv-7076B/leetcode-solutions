class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int num = 0;
        if (x < 0)
            return false;
        while (x != 0) {
            int lastDig = x % 10;
            num = (num * 10) + lastDig;
            x /= 10;
        }
        return original == num;
    }
}