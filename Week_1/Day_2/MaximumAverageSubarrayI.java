// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i <= nums.length - k; i++) {
//             double sum = 0;
//             for (int j = i; j < i + k; j++) {
//                 sum += nums[j];
//             }
//             maxSum = Math.max(maxSum, sum);
//         }

//         return maxSum / k;
//     }
// }

// Optimal solutions , sliding window 

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int j = k; j < nums.length; j++) {

            sum += nums[j];
            sum -= nums[j - k];

            maxSum = Math.max(maxSum, sum);

        }
        return maxSum / k;

    }
}
