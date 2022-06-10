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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dh = new ListNode(-1);
        ListNode dt = dh;
        
        while(list1 != null && list2 != null){
            
            if(list1.val <= list2.val){
                   dt.next = list1;
                   list1 = list1.next;
            }
            else{
                dt.next = list2;
                list2 = list2.next;
            }
            
            
            dt = dt.next;
        } 
        
        if(list1 != null){
            dt.next = list1;
        }
        if(list2 != null) {
            dt.next = list2;
        }
        
        return dh.next;
    }
}