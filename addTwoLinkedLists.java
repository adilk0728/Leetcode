// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Example:

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3 = new ListNode(0);
        ListNode dummy_head = l3;
        int sum = 0, carry = 0;
        
        while(l1!=null || l2!=null){
            
           int l1_val = (l1!=null) ? l1.val: 0;
           int l2_val = (l2!=null) ? l2.val : 0;
            
            sum = l1_val + l2_val + carry;
            int lastDigit = sum%10;
            carry = sum/10;
            
            ListNode temp = new ListNode(lastDigit);
            l3.next = temp;
            
            if (l1!=null) {
                l1 = l1.next;
            }
            if (l2!=null) {
                l2 = l2.next;}
            // l1 = l1.next;
            // l2 = l2.next;
            l3 = l3.next;
            
        }
        
        if(carry > 0){
            ListNode carry_temp = new ListNode(carry);
            l3.next = carry_temp;
            l3 = l3.next;
            
        }
    return dummy_head.next;}
}