package LEETCODE;

// import java.util.*;

// class decodestring {

//     public String decodeString(String s) {

//         Stack<Integer> numberStack = new Stack<>();
//         Stack<StringBuilder> stringStack = new Stack<>();

//         StringBuilder current = new StringBuilder();
//         int number = 0;

//         for (char ch : s.toCharArray()) {

//             if (Character.isDigit(ch)) {

//                 number = number * 10 + (ch - '0');

//             } else if (ch == '[') {

//                 numberStack.push(number);
//                 stringStack.push(current);

//                 number = 0;
//                 current = new StringBuilder();

//             } else if (ch == ']') {

//                 int repeat = numberStack.pop();

//                 StringBuilder previous = stringStack.pop();

//                 for (int i = 0; i < repeat; i++) {
//                     previous.append(current);
//                 }

//                 current = previous;

//             } else {

//                 current.append(ch);

//             }
//         }

//         return current.toString();
//     }
// }



import java.util.Stack;

public class decodestring {

    public static String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {

                number = number * 10 + (ch - '0');

            } else if (ch == '[') {

                numberStack.push(number);
                stringStack.push(current);

                number = 0;
                current = new StringBuilder();

            } else if (ch == ']') {

                int repeat = numberStack.pop();

                StringBuilder previous = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    previous.append(current);
                }

                current = previous;

            } else {

                current.append(ch);

            }
        }

        return current.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";

        System.out.println(decodeString(s));
    }
}