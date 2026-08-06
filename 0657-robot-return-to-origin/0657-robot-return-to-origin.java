class Solution {
    public boolean judgeCircle(String moves) {
        char[] m = moves.toCharArray();
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        for (char ch : m) {
            if (ch == 'U')
                up++;
            if (ch == 'D')
                down++;
            if (ch == 'R')
                right++;
            if (ch == 'L')
                left++;
        }
        return left == right && up == down;
    }
}