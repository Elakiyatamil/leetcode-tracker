// Last updated: 09/07/2026, 09:46:28
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
    public ListNode deleteMiddle(ListNode head) {
        // Edge case
        if (head == null || head.next == null) {
            return null;
        }

        // Step 1: find size
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: find middle
        int mid = size / 2;

        // Step 3: go to node before middle
        temp = head;
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }

        // Step 4: delete middle
        temp.next = temp.next.next;

        return head;
    }
}
