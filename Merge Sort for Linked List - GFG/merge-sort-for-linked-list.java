// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node getMidNode(Node head){
        if(head == null) return head;
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    static Node mergeList(Node list1, Node list2){
        if(list1  == null) return list2;
        if(list2  == null) return list1;
        
        Node result = null;
        
        if(list1.data > list2.data){
            result = list2;
            result.next = mergeList(list1, list2.next);
        }
        else{
            result = list1;
            result.next = mergeList(list1.next, list2);
        }
        
        return result;
    }
    
    static Node mergeSort(Node head)
    {
        if(head == null || head.next == null) return head;
        
        Node midNode  = getMidNode(head);
        Node midNext = midNode.next;
        
        midNode.next  = null;
        
        Node leftList = mergeSort(head);
        Node rightList = mergeSort(midNext);
        
        Node sortedList = mergeList(leftList, rightList);
        
        return sortedList;
    }
}


