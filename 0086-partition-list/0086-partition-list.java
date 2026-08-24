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
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode pt1 = new ListNode(-1);
        ListNode pt2 = new ListNode(-1);
        ListNode small = pt1;
        ListNode large = pt2;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                small.next = temp;
                small = small.next;
            } else if (temp.val >= x) {
                large.next = temp;
                large = large.next;
            }
            temp = temp.next;
        }
        small.next = pt2.next;
        large.next = null;
        return pt1.next;
    }
}