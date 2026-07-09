package LEETCODE;


class removeNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove node
        slow.next = slow.next.next;

        return dummy.next;
    }
}

// class ListNode {

//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//     }
// }

// public class RemoveNthNode {

//     public static ListNode removeNthFromEnd(ListNode head, int n) {

//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         ListNode fast = dummy;
//         ListNode slow = dummy;

//         for (int i = 0; i <= n; i++) {
//             fast = fast.next;
//         }

//         while (fast != null) {
//             fast = fast.next;
//             slow = slow.next;
//         }

//         slow.next = slow.next.next;

//         return dummy.next;
//     }

//     public static void print(ListNode head) {

//         while (head != null) {
//             System.out.print(head.val + " ");
//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {

//         ListNode first = new ListNode(1);
//         ListNode second = new ListNode(2);
//         ListNode third = new ListNode(3);
//         ListNode fourth = new ListNode(4);
//         ListNode fifth = new ListNode(5);

//         first.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;

//         ListNode newHead = removeNthFromEnd(first, 2);

//         print(newHead);
//     }
// }