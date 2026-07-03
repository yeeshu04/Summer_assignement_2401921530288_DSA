package LEETCODE;

public class ransom {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count letters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        // Use letters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            int index = ransomNote.charAt(i) - 'a';

            if (count[index] == 0) {
                return false;
            }

            count[index]--;
        }

        return true;
    }
}




// public class ransom {

//     public static boolean canConstruct(String ransomNote, String magazine) {

//         int[] count = new int[26];

//         // Count letters in magazine
//         for (int i = 0; i < magazine.length(); i++) {
//             count[magazine.charAt(i) - 'a']++;
//         }

//         // Use letters for ransomNote
//         for (int i = 0; i < ransomNote.length(); i++) {

//             int index = ransomNote.charAt(i) - 'a';

//             if (count[index] == 0) {
//                 return false;
//             }

//             count[index]--;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         String ransomNote = "aa";
//         String magazine = "aab";

//         System.out.println(canConstruct(ransomNote, magazine));
//     }
// }