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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 0;
        ListNode l1 = list1;
        while (i < a - 1) {
            l1 = l1.next;
            i++;
        }
        int j = 0;
        ListNode l2 = list1;
        while (j < b + 1) {
            l2 = l2.next;
            j++;
        }

        ListNode l3 = list2;
        while (l3.next != null) {
            l3 = l3.next;
        }
        l1.next = list2;
        l3.next = l2;
        return list1;
    }
}