/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 Requirements:
 1. Find the node in the middle of list
 
 Pseudo-Code:
 1. Find length of the list
 
2.        length = length/2
        while(length > 0)
            temp = temp.next;
            length--;
            
            return temp;
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next == null)
            return head;
        if(head.next.next == null)
            return head.next;
        
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        temp = head;
        
        length = length/2;
        while(length > 0){
            temp = temp.next;
            length--;
        }
        
                
        return temp;
    }
}