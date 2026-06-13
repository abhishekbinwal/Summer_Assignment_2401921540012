class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // optimal , sliding window + freq Array

        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())
            return list;

        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

        }

        if (Arrays.equals(pCount, sCount)) {
            list.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            // add new , remove old
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pCount, sCount)) {
                list.add(i - p.length() + 1);
            }
        }
        return list;

    }
}