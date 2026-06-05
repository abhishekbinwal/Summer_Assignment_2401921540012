// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum =nums[0] ;
//         int currentSum=nums[0];

//         if(nums.length == 1) return nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         return maxSum;

//     }
// }

//  or

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            currentSum += n;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
