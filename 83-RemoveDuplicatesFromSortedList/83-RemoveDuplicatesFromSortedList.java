// Last updated: 09/07/2026, 09:53:32
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next != null){
            if(temp.next.val == temp.val ){
                temp.next = temp.next.next;
            }
            else temp=temp.next;
        }
        return head;
    }
}