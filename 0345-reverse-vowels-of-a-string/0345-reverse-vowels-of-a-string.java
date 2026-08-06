class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        char[] ch = s.toCharArray();
        int right = ch.length - 1;
        Set<Character> set = new HashSet<>();
        set.addAll(List.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));

        while (left < right) {
            if (set.contains(ch[left]) && set.contains(ch[right])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (set.contains(ch[left])) {
                right--;
            } else
                left++;
        }
        String ans = new String(ch);
        return ans;
    }
}