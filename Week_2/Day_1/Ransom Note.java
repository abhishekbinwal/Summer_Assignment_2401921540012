class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // hashmap , count + for mag , - for rans ,if <0 false...
        // HashMap<Character, Integer> freq = new HashMap<>();

        // for (char c : magazine.toCharArray()) {
        // freq.put(c, freq.getOrDefault(c, 0) + 1);
        // }

        // for (char c : ransomNote.toCharArray()) {
        // freq.put(c, freq.getOrDefault(c, 0) - 1);
        // if (freq.get(c) < 0) {
        // return false;
        // }
        // }

        // return true;

        // // HashArray for better time complexity

        int[] freq = new int[26];

        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;

        }

        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}