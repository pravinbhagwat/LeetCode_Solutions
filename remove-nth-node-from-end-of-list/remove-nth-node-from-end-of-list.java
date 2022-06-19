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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        if(size < n) return head;
        if(size == n) return head.next;
        if(size > n) {
            int skip = size-n;
            temp = head;
            ListNode prev = null;
            
            while(skip-- > 0){
                prev = temp;
                temp = temp.next;
            }            
            prev.next = temp.next;
        }
        
        
        return head;
        
    }
}