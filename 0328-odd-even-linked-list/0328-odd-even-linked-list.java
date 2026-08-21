/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode mid = head.next;
        ListNode res = head.next;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even = odd.next;
            mid.next = even;
            mid = even;
        }
        odd.next = res;
        return head;
    }
}

// ListNode l1 = head;
// ListNode l2 = head.next;
// while (l1.next != null && l2 != null) {
//     l1.next = l1.next.next;
//     if (l1.next == null) {
//         l1.next = l2;
//     }
//     l2.next = l2.next.next;
// }
// return head;
