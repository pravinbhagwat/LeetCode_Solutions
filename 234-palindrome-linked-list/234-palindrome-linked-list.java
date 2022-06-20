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
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        ListNode after = head.next;
        after.next = head;
        head.next = null;
        return newHead;
    }
    
    public boolean isPalindrome(ListNode head) {  
        if(head == null) return false;   
        
        ListNode mid = getMid(head);
        ListNode revHead = reverse(mid);
        ListNode temp = head;
        while(temp != null && revHead != null){
            if(temp.val != revHead.val) return false;
            temp = temp.next;
            revHead = revHead.next;
        }
        return true;
    }
}