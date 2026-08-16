class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> m1 = new HashMap<>();
        Map<String, Character> m2 = new HashMap<>();
        String[] str = s.split(" ");

        if (str.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            String b = str[i];

            if (m1.containsKey(a) && !m1.get(a).equals(b))
                return false;
            if (m2.containsKey(b) && m2.get(b) != a)
                return false;

            m1.put(a, b);
            m2.put(b, a);
        }
        return true;
    }
}