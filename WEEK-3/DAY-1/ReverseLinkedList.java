 package LEETCODE;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        return prev;
    }
}
















// public class ReverseLinkedList {
 
//     class ListNode {

//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//     }
// }

// public static class Solution {

//     public static ListNode reverseList(ListNode head) {

//         ListNode prev = null;
//         ListNode current = head;

//         while (current != null) {

//             ListNode next = current.next;

//             current.next = prev;

//             prev = current;

//             current = next;
//         }

//         return prev;
//     }

//     public static void printList(ListNode head) {

//         while (head != null) {
//             System.out.print(head.val + " ");
//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {

//         ReverseLinkedList rll = new ReverseLinkedList();
//         ListNode first = rll.new ListNode(1);
//         ListNode second = rll.new ListNode(2);
//         ListNode third = rll.new ListNode(3);
//         ListNode fourth = rll.new ListNode(4);
//         ListNode fifth = rll.new ListNode(5);

//         first.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;

//         ListNode newHead = reverseList(first);

//         printList(newHead);
//     }
// }

// }
