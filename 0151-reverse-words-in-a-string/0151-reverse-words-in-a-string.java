class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int end = str.length - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = end; i >= 0; i--) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().stripTrailing();
    }
}