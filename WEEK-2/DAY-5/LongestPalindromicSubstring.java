package LEETCODE;

class LongestPalindromicSubstring {

    int start = 0;
    int maxLength = 0;

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1)
            return "";

        for (int i = 0; i < s.length(); i++) {

            expand(s, i, i);       // Odd length

            expand(s, i, i + 1);   // Even length
        }

        return s.substring(start, start + maxLength);
    }

    private void expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        int length = right - left - 1;

        if (length > maxLength) {

            maxLength = length;

            start = left + 1;
        }
    }
}



// public class LongestPalindromicSubstring {

//     static int start = 0;
//     static int maxLength = 0;

//     public static String longestPalindrome(String s) {

//         if (s.length() == 0)
//             return "";

//         for (int i = 0; i < s.length(); i++) {

//             expand(s, i, i);

//             expand(s, i, i + 1);
//         }

//         return s.substring(start, start + maxLength);
//     }

//     public static void expand(String s, int left, int right) {

//         while (left >= 0 &&
//                right < s.length() &&
//                s.charAt(left) == s.charAt(right)) {

//             left--;
//             right++;
//         }

//         int length = right - left - 1;

//         if (length > maxLength) {

//             maxLength = length;

//             start = left + 1;
//         }
//     }

//     public static void main(String[] args) {

//         String s = "babad";

//         System.out.println(longestPalindrome(s));
//     }
// }