class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            sb.append(ch);

            if (i + 1 < s.length()) {
                int num = s.charAt(i + 1) - '0';
                sb.append((char) (s.charAt(i) + num));
            }
        }
        return sb.toString();
    }
}