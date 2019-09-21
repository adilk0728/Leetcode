// Given a linked list, determine if it has a cycle in it.

// To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        if(head == null){
            return false;
        }
        
        while(fastPtr != null && fastPtr.next != null){
            
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            
            if(slowPtr == fastPtr){
                return true;
            }
        }
    return false;}   
}