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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode nxt = head;
        while (temp != null) {
            nxt = nxt.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        return prev;
    }
}
// ListNode dummy = new ListNode(0);
// ListNode curr = head;
// ListNode nxt = curr.next;
// ListNode prev = dummy;

// while (nxt != null) {
//     prev.next = nxt;
//     curr.next = nxt.next;
//     nxt.next = curr;
// }
// return dummy.next;
// ListNode temp = head;
// ListNode nxt = head.next;
// ListNode prev = null;
// while(temp != null){
//     prev.next = nxt;
//     nxt.next = temp;
//     temp.next = nxt.next;
// }return head;