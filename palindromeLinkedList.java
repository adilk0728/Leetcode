// Given a singly linked list, determine if it is a palindrome.

// Example 1:

// Input: 1->2
// Output: false
// Example 2:

// Input: 1->2->2->1
// Output: true


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stck = new Stack<Integer>();
        while(temp != null){
            stck.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        
        while(!stck.empty()){
            if(stck.peek()!=temp.val){
                return false;
            } 
            stck.pop();
            
            temp = temp.next;
            
        }
        
 return true;}
}