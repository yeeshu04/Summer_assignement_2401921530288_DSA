package LEETCODE;

import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {

        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.offer(t);

        while (queue.peek() < t - 3000) {

            queue.poll();
        }

        return queue.size();
    }
}









// import java.util.LinkedList;
// import java.util.Queue;

// public class RecentCounter {

//     Queue<Integer> queue;

//     public RecentCounter() {

//         queue = new LinkedList<>();
//     }

//     public int ping(int t) {

//         queue.offer(t);

//         while (queue.peek() < t - 3000) {

//             queue.poll();
//         }

//         return queue.size();
//     }

//     public static void main(String[] args) {

//         RecentCounter rc = new RecentCounter();

//         System.out.println(rc.ping(1));

//         System.out.println(rc.ping(100));

//         System.out.println(rc.ping(3001));

//         System.out.println(rc.ping(3002));
//     }
// }