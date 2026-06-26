package LEETCODE;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}








// package LEETCODE;

// import java.util.HashSet;

// public class duplicate {

//     public static boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             if (set.contains(num)) {
//                 return true;
//             }

//             set.add(num);
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 1};

//         boolean result = containsDuplicate(nums);

//         System.out.println(result);
//     }
// }