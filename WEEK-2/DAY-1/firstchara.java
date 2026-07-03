package LEETCODE;

public class firstchara {
    public int firstUniqChar(String s) {

        int[] count = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}








// public class firstchara {

//     public static int firstUniqChar(String s) {

//         int[] count = new int[26];

//         // Count frequency
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//         }

//         // Find first unique character
//         for (int i = 0; i < s.length(); i++) {
//             if (count[s.charAt(i) - 'a'] == 1) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {

//         String s = "loveleetcode";

//         System.out.println(firstUniqChar(s));
//     }
// }