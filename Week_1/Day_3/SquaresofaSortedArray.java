class Solution {
    public int[] sortedSquares(int[] nums) {

        // for(int i=0 ; i<nums.length ; i++){
        // nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // Two pointer , optimal solution
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