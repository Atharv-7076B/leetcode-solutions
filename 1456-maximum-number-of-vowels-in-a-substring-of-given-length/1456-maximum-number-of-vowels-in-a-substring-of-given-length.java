class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int maxCount = 0;
        int windowSize = k;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                count++;
            }
        }

        maxCount = count;

        for (int i = k; i < s.length(); i++) {

            if (set.contains(s.charAt(i))) {
                count++;
            }

            if (set.contains(s.charAt(i - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);

        }
        return maxCount;
    }
}