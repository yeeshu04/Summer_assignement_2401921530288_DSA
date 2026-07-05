package LEETCODE;

class StringCompression {

    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index++] = current;

            if (count > 1) {

                String num = String.valueOf(count);

                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}




// public class StringCompression {

//     public static int compress(char[] chars) {

//         int index = 0;
//         int i = 0;

//         while (i < chars.length) {

//             char current = chars[i];
//             int count = 0;

//             while (i < chars.length && chars[i] == current) {
//                 count++;
//                 i++;
//             }

//             chars[index++] = current;

//             if (count > 1) {

//                 String num = String.valueOf(count);

//                 for (char c : num.toCharArray()) {
//                     chars[index++] = c;
//                 }
//             }
//         }

//         return index;
//     }

//     public static void main(String[] args) {

//         char[] chars = {
//                 'a','a','b','b','c','c','c'
//         };

//         int length = compress(chars);

//         System.out.println("New Length = " + length);

//         for (int i = 0; i < length; i++) {
//             System.out.print(chars[i] + " ");
//         }
//     }
// }