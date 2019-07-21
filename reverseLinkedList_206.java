// Reverse a singly linked list.

// Example:

// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null){
            return head;
        }
        
        ListNode prevNode = null;
        ListNode current = head;
        
        while(current!=null){
            ListNode currentNext = current.next; 
            current.next = prevNode;
            prevNode = current;
            current=currentNext;
        }
        return prevNode;
        
    }
}