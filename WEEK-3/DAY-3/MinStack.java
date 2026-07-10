package LEETCODE;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}








// import java.util.Stack;

// public class MinStack {

//     Stack<Integer> stack;
//     Stack<Integer> minStack;

//     public MinStack() {
//         stack = new Stack<>();
//         minStack = new Stack<>();
//     }

//     public void push(int val) {

//         stack.push(val);

//         if (minStack.isEmpty()) {
//             minStack.push(val);
//         } else {
//             minStack.push(Math.min(val, minStack.peek()));
//         }
//     }

//     public void pop() {
//         stack.pop();
//         minStack.pop();
//     }

//     public int top() {
//         return stack.peek();
//     }

//     public int getMin() {
//         return minStack.peek();
//     }

//     public static void main(String[] args) {

//         MinStack obj = new MinStack();

//         obj.push(-2);
//         obj.push(0);
//         obj.push(-3);

//         System.out.println("Minimum = " + obj.getMin());

//         obj.pop();

//         System.out.println("Top = " + obj.top());

//         System.out.println("Minimum = " + obj.getMin());
//     }
// }