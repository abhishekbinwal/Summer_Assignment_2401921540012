class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);

            } else {
                return true;
            }

        }
        return false;

    }
}