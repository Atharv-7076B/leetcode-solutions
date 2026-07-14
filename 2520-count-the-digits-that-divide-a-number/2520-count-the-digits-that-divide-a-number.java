class Solution {
    public int countDigits(int num) {
        int count = 0;
        int n = num;

        while (n > 0) {
            int lstdigit = n % 10;

            if (num % lstdigit == 0)
                count++;

            n /= 10;
        }
        return count;
    }
}