class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secLargest = 0;
        // if (n % 10 == 0)
        //     return 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > largest) {
                secLargest = largest;
                largest = lastDigit;
            } else if (lastDigit >= secLargest) {
                secLargest = lastDigit;
            }
            n /= 10;
        }
        return largest * secLargest;
    }
}