package LEETCODE;

class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }

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

// public class MergeTwoSortedLists {

//     public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//         ListNode dummy = new ListNode(-1);
//         ListNode current = dummy;

//         while (list1 != null && list2 != null) {

//             if (list1.val <= list2.val) {
//                 current.next = list1;
//                 list1 = list1.next;
//             } else {
//                 current.next = list2;
//                 list2 = list2.next;
//             }

//             current = current.next;
//         }

//         if (list1 != null) {
//             current.next = list1;
//         }

//         if (list2 != null) {
//             current.next = list2;
//         }

//         return dummy.next;
//     }

//     public static void printList(ListNode head) {

//         while (head != null) {
//             System.out.print(head.val + " ");
//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {

//         ListNode a1 = new ListNode(1);
//         ListNode a2 = new ListNode(2);
//         ListNode a3 = new ListNode(4);

//         a1.next = a2;
//         a2.next = a3;

//         ListNode b1 = new ListNode(1);
//         ListNode b2 = new ListNode(3);
//         ListNode b3 = new ListNode(4);

//         b1.next = b2;
//         b2.next = b3;

//         ListNode result = mergeTwoLists(a1, b1);

//         printList(result);
//     }
// }