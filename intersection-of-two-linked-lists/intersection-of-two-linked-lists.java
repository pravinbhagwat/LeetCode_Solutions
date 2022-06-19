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
        ListNode tempA = headA, tempB = headB;
        int count1 = 0;
        int count2 = 0;
        
        while(tempA != null){
            count1++;
            tempA = tempA.next;
        }
        while(tempB != null){
            count2++;
            tempB = tempB.next;
        }
        
        tempA = headA;
        tempB = headB;
        int skip = 0;
        if(count1 > count2) {
            skip = count1 - count2;
            
            while(skip-- > 0){
                tempA = tempA.next;
            }
            while(tempA != null && tempB != null){
                if(tempA == tempB) return tempA;
                tempA = tempA.next;
                tempB = tempB.next;
            }            
        }
        else{
            skip = count2 - count1;
            while(skip-- > 0){
                tempB = tempB.next;
            }
            while(tempA != null && tempB != null){
                if(tempA == tempB) return tempA;
                tempA = tempA.next;
                tempB = tempB.next;
            }            
        }        
        
        return null;
    }
}