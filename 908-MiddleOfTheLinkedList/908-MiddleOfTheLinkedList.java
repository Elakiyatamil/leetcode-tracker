// Last updated: 09/07/2026, 09:49:09
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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next; 
        }
        ListNode a = head;
        int n = size/2;
        for(int i=0;i<n;i++)
        {
           a = a.next;   
        }
        return a;
    }
}