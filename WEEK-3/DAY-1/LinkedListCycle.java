package LEETCODE;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}




// class ListNode {

//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//     }
// }

// public class LinkedListCycle {

//     public static boolean hasCycle(ListNode head) {

//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {

//             slow = slow.next;

//             fast = fast.next.next;

//             if (slow == fast) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {

//         ListNode first = new ListNode(3);
//         ListNode second = new ListNode(2);
//         ListNode third = new ListNode(0);
//         ListNode fourth = new ListNode(-4);

//         first.next = second;
//         second.next = third;
//         third.next = fourth;

//         // Create cycle
//         fourth.next = second;

//         System.out.println(hasCycle(first));
//     }
// }