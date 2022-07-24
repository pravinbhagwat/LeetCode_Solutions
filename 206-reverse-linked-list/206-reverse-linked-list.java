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

// 1. Interative
// 2. Recursive

class Solution {
    private ListNode approach1(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode current = head;
        ListNode nextNode = null;
        ListNode prevNode = null;
        
        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }
    
    private ListNode approach2(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newHead = approach2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public ListNode reverseList(ListNode head) {
        
        //return approach1(head);
        return approach2(head);
    }
}