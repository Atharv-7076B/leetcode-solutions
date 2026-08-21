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
    public ListNode mergeNodes(ListNode head) {
        ListNode zero = head;
        ListNode temp = head.next;
        int sum = 0;

        while (temp != null) {
            while (temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            zero.val = sum;
            zero.next = temp;
            zero = temp;
            temp = temp.next;
            sum = 0;
        }

        ListNode check = head;
        ListNode prev = check;
        while (check.val != 0) {
            prev = check;
            check = check.next;
        }
        prev.next = null;

        return head;
    }
}

// ArrayList<Integer> sums = new ArrayList<>();
// int size = 0;
// ListNode temp = head;
// int sum = 0;
// while (temp != null) {
//     temp = temp.next;
//     size++;
// }
// ListNode s = head;
// for (int i = 0; i < size; i++) {
//     while (s.next != null) {
//         if (s.val != 0) {
//             sum += s.val;
//         }
//         sums.add(sum);
//         s = s.next;
//         sum = 0;
//     }
// }

// ListNode ans = null;
// for (int j = 0; j < sums.size(); j++) {
//     ans.next.val = sums.get(j);
// }
// return ans.next;