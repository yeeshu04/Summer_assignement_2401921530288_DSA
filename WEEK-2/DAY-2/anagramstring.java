package LEETCODE;

import java.util.*;

class anagramstring {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] window = new int[26];

        // Count frequencies
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (matches(pCount, window)) {
            result.add(0);
        }

        // Sliding Window
        for (int i = p.length(); i < s.length(); i++) {

            window[s.charAt(i) - 'a']++;

            window[s.charAt(i - p.length()) - 'a']--;

            if (matches(pCount, window)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
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









// import java.util.*;

// public class anagramstring {

//     public static List<Integer> findAnagrams(String s, String p) {

//         List<Integer> result = new ArrayList<>();

//         if (p.length() > s.length()) {
//             return result;
//         }

//         int[] pCount = new int[26];
//         int[] window = new int[26];

//         // Count frequencies
//         for (int i = 0; i < p.length(); i++) {
//             pCount[p.charAt(i) - 'a']++;
//             window[s.charAt(i) - 'a']++;
//         }

//         if (matches(pCount, window)) {
//             result.add(0);
//         }

//         // Sliding Window
//         for (int i = p.length(); i < s.length(); i++) {

//             window[s.charAt(i) - 'a']++;

//             window[s.charAt(i - p.length()) - 'a']--;

//             if (matches(pCount, window)) {
//                 result.add(i - p.length() + 1);
//             }
//         }

//         return result;
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

//         String s = "cbaebabacd";
//         String p = "abc";

//         System.out.println(findAnagrams(s, p));
//     }
// }