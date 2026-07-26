class Solution {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int maxPro = 1;
        if (nums.length == 3) {
            for (int i = 0; i < 3; i++) {
                maxPro = maxPro * nums[i];
            }
            return maxPro;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > largest) {
                    thirdLargest = secLargest;
                    secLargest = largest;
                    largest = nums[i];
                } else if (nums[i] > secLargest) {
                    thirdLargest = secLargest;
                    secLargest = nums[i];
                } else if (nums[i] > thirdLargest) {
                    thirdLargest = nums[i];
                }

                if (nums[i] < smallest) {
                    secSmallest = smallest;
                    smallest = nums[i];
                } else if (nums[i] < secSmallest) {
                    secSmallest = nums[i];
                }
            }
        }
        int pro1 = largest * secLargest * thirdLargest;
        int pro2 = largest * smallest * secSmallest;
        return pro1 > pro2 ? pro1 : pro2;
    }
}