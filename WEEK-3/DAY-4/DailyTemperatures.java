package LEETCODE;

import java.util.Stack;

class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();

                answer[index] = i - index;
            }

            stack.push(i);
        }

        return answer;
    }
}









// import java.util.Stack;
// import java.util.Arrays;

// public class DailyTemperatures {

//     public static int[] dailyTemperatures(int[] temperatures) {

//         int n = temperatures.length;

//         int[] answer = new int[n];

//         Stack<Integer> stack = new Stack<>();

//         for (int i = 0; i < n; i++) {

//             while (!stack.isEmpty() &&
//                    temperatures[i] > temperatures[stack.peek()]) {

//                 int index = stack.pop();

//                 answer[index] = i - index;
//             }

//             stack.push(i);
//         }

//         return answer;
//     }

//     public static void main(String[] args) {

//         int[] temperatures = {73,74,75,71,69,72,76,73};

//         System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
//     }
// }