package LEETCODE;

class maxsub {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}




//VSCODE

// public class maxsub {

//     public static int maxSubArray(int[] nums) {
//         int currentSum = nums[0];
//         int maxSum = nums[0];

//         for (int i = 1; i < nums.length; i++) {

//             if (currentSum + nums[i] > nums[i]) {
//                 currentSum = currentSum + nums[i];
//             } else {
//                 currentSum = nums[i];
//             }

//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//         }

//         return maxSum;
//     }

//     public static void main(String[] args) {
//         int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//         System.out.println(maxSubArray(nums));
//     }
// }