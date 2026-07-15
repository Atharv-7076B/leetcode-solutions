class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOfOdd = n * n;
        int sumOfEven = n * (n + 1);

        return gcd(sumOfOdd, sumOfEven);
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
    //     for (int i = 1; i <= n; i++) {
    //         if (i % 2 == 1) {
    //             sumOfOdd += i;
    //         } else
    //             sumOfEven += i;
    //     }
    //     return gcd(sumOfOdd, sumOfEven);
    // }