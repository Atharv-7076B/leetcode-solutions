class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";

        boolean is_negative = num < 0;
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remain = n % 7;
            sb.append(remain);
            n /= 7;
        }
        if (is_negative)
            sb.append("-");

        return sb.reverse().toString();
    }
}
// return Integer.toString(num, 7);