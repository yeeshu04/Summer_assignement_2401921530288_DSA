package LEETCODE;

class twosum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}


// package LEETCODE;

// import java.util.*;

// public class twosum {
//     public static void main(String[] args) {

//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt(); // size of array
//             int target = sc.nextInt(); // target sum

//             int[] arr = new int[n]; // array to hold the input numbers

//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();
//             }

//             for (int i = 0; i < n; i++) {
//                 for (int j = i + 1; j < n; j++) {

//                     if (arr[i] + arr[j] == target) {
//                         System.out.println(i + " " + j);
//                         return;
//                     }
//                 }
//             }

//             System.out.println("No pair found");
//         }
//     }
// }