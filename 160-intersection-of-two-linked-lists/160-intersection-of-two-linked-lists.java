/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null) return headA; 
        if(headB == null) return headB;
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        int length1 = 0;
        int length2 = 0;
        
        while(temp1 != null) {
            length1++;
            temp1 = temp1.next;            
        }
                
        while(temp2 != null) {
            length2++;
            temp2 = temp2.next;            
        }
        
        temp1 = headA;
        temp2 = headB;
        
        int skip = 0;
        if(length1 > length2) {
            skip = length1 - length2;
            while(skip > 0){
                temp1 = temp1.next;
                skip--;
            }    
        }
        else {
            skip = length2 - length1;
            while(skip > 0){
                temp2 = temp2.next;
                skip--;
            } 
        }
        
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
        
        
        
        
    }
}