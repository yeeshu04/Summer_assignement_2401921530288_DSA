package LEETCODE;

import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> input;
    Stack<Integer> output;

    public QueueUsingStacks() {

        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {

        input.push(x);
    }

    public int pop() {

        if (output.isEmpty()) {

            while (!input.isEmpty()) {

                output.push(input.pop());
            }
        }

        return output.pop();
    }

    public int peek() {

        if (output.isEmpty()) {

            while (!input.isEmpty()) {

                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {

        return input.isEmpty() && output.isEmpty();
    }
}











// import java.util.Stack;

// public class QueueUsingStacks {

//     Stack<Integer> input = new Stack<>();
//     Stack<Integer> output = new Stack<>();

//     public void push(int x) {

//         input.push(x);
//     }

//     public int pop() {

//         if (output.isEmpty()) {

//             while (!input.isEmpty()) {

//                 output.push(input.pop());
//             }
//         }

//         return output.pop();
//     }

//     public int peek() {

//         if (output.isEmpty()) {

//             while (!input.isEmpty()) {

//                 output.push(input.pop());
//             }
//         }

//         return output.peek();
//     }

//     public boolean empty() {

//         return input.isEmpty() && output.isEmpty();
//     }

//     public static void main(String[] args) {

//         QueueUsingStacks queue = new QueueUsingStacks();

//         queue.push(10);
//         queue.push(20);
//         queue.push(30);

//         System.out.println(queue.peek());

//         System.out.println(queue.pop());

//         System.out.println(queue.peek());

//         System.out.println(queue.empty());
//     }
// }