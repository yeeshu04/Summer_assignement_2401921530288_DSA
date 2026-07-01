package LEETCODE;

class movezero {
    public void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}






// package LEETCODE;
// public class movezero {

//     public static void moveZeroes(int[] nums) {

//         int index = 0;

//         // Move non-zero elements
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nums[index] = nums[i];
//                 index++;
//             }
//         }

//         // Fill remaining positions with zeros
//         while (index < nums.length) {
//             nums[index] = 0;
//             index++;
//         }
//     }

//     public static void main(String[] args) {

//         int[] nums = {0, 1, 0, 3, 12};

//         moveZeroes(nums);

//         System.out.print("Result: ");

//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }