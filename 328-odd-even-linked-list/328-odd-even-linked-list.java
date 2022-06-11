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
        if(head == null || head.next == null) return head;
        
        ListNode eh = new ListNode(-1);
        ListNode et = eh;
        
        ListNode oh = new ListNode(-1);
        ListNode ot = oh;
        
        ListNode temp = head;
        int idx = 1;
        while(temp != null){
            if(idx % 2 == 0){
                et.next = temp;
                et = et.next;
            }
            else{
                ot.next = temp;
                ot = ot.next;
            }
            
            temp = temp.next;
            idx++;
        }
        
        ot.next  = eh.next;
        et.next = null;
        
        return oh.next;
        
       
    }
}