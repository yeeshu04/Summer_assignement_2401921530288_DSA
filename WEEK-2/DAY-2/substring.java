package LEETCODE;

import java.util.HashSet;

class substring {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}






// import java.util.HashSet;

// public class substring {

//     public static int lengthOfLongestSubstring(String s) {

//         HashSet<Character> set = new HashSet<>();

//         int left = 0;
//         int maxLength = 0;

//         for (int right = 0; right < s.length(); right++) {

//             while (set.contains(s.charAt(right))) {
//                 set.remove(s.charAt(left));
//                 left++;
//             }

//             set.add(s.charAt(right));

//             maxLength = Math.max(maxLength, right - left + 1);
//         }

//         return maxLength;
//     }

//     public static void main(String[] args) {

//         String s = "abcabcbb";

//         System.out.println(lengthOfLongestSubstring(s));
//     }
// }