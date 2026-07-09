package LEETCODE;

class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;

        while (slow != null) {

            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare both halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}





// class ListNode {

//     int val;
//     ListNode next;

//     ListNode(int val) {
//         this.val = val;
//     }
// }

// public class PalindromeLinkedList {

//     public static boolean isPalindrome(ListNode head) {

//         if (head == null || head.next == null)
//             return true;

//         // Find middle
//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Reverse second half
//         ListNode prev = null;

//         while (slow != null) {

//             ListNode next = slow.next;
//             slow.next = prev;
//             prev = slow;
//             slow = next;
//         }

//         // Compare
//         ListNode first = head;
//         ListNode second = prev;

//         while (second != null) {

//             if (first.val != second.val)
//                 return false;

//             first = first.next;
//             second = second.next;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         ListNode first = new ListNode(1);
//         ListNode second = new ListNode(2);
//         ListNode third = new ListNode(2);
//         ListNode fourth = new ListNode(1);

//         first.next = second;
//         second.next = third;
//         third.next = fourth;

//         System.out.println(isPalindrome(first));
//     }
// }