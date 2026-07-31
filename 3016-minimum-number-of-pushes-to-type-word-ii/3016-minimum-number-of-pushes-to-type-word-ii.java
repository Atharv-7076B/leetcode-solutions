class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> li = new ArrayList<>(map.values());
        Collections.sort(li, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < li.size(); i++) {
            ans += ((i / 8) + 1) * li.get(i);
        }
        return ans;
    }
}