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
    static ListNode approach1(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null){
             //System.out.println(current.val);
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        //System.out.println(current.val);
        head  = prev;
        return head;
    }
    
    public ListNode reverseList(ListNode head) {
        
        return approach1(head);
    }
}