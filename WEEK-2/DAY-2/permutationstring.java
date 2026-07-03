package LEETCODE;

class permutationstring {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        if (matches(s1Count, windowCount)) {
            return true;
        }

        // Sliding Window
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add new character
            windowCount[s2.charAt(i) - 'a']++;

            // Remove old character
            windowCount[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}












// public class permutationstring {

//     public static boolean checkInclusion(String s1, String s2) {

//         if (s1.length() > s2.length()) {
//             return false;
//         }

//         int[] s1Count = new int[26];
//         int[] windowCount = new int[26];

//         // Count characters
//         for (int i = 0; i < s1.length(); i++) {
//             s1Count[s1.charAt(i) - 'a']++;
//             windowCount[s2.charAt(i) - 'a']++;
//         }

//         if (matches(s1Count, windowCount)) {
//             return true;
//         }

//         // Sliding window
//         for (int i = s1.length(); i < s2.length(); i++) {

//             windowCount[s2.charAt(i) - 'a']++;

//             windowCount[s2.charAt(i - s1.length()) - 'a']--;

//             if (matches(s1Count, windowCount)) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static boolean matches(int[] a, int[] b) {

//         for (int i = 0; i < 26; i++) {

//             if (a[i] != b[i]) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         String s1 = "ab";
//         String s2 = "eidbaooo";

//         System.out.println(checkInclusion(s1, s2));
//     }
// }