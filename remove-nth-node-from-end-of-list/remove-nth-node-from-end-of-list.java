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

// Approach
//1. O(n) + O(n), Space = O(1)
//2. 
class Solution {
    public ListNode Approach1(ListNode head, int n){
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
    
    public ListNode approach2(ListNode head, int n){
        ListNode temp = new ListNode();
        ListNode slow = temp;
        ListNode fast = temp;
        temp.next = head;
        
        while(n-- > 0){
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return temp.next;
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return approach2(head, n);
    }
}