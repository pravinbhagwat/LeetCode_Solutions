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
    
    public int traverse(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }    
    
    private ListNode findMid(ListNode head, int length){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
    
    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode List1 = head;
        int length = traverse(List1);
        ListNode midNode = findMid(List1, length);
        
        ListNode midNodeNext = midNode.next;
        midNode.next = null;
        // ListNode List1 = head;
        ListNode List2 = reverseList(midNodeNext);
        
        while(List1 != null && List2 != null){
            if(List1.val != List2.val) return false;
            List1 = List1.next;
            List2 = List2.next;
        }
        
        //if(List1 == null && List2 == null) return true;
        return true;
    }
}