class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int rindex = nums.length - 1;

        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq > rightsq) {
                result[rindex] = leftsq;
                left++;
            } else {
                result[rindex] = rightsq;
                right--;
            }
            rindex--;
        }
        return result;
    }
}