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
/**
 * Requirements:
 1. Delete node that is nth from the last node
 2. n >= 1, cannot exceed linked list length
 3. Max length of linked list is 30, minimum is 1
 
 Case:
 
 Pseudo-code #1:
 1. Iterate through linked list once to find the length - n
 2. Iterate through linked list again and delete the target value
    Variables: temp = head, length = list.length - n, index = 0
 3. return head;
 */
class RemoveNodeFromEnd {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        
        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        
        for(int i = 1; i <= n + 1; i++){
            fast= fast.next;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return dummy_head.next;
    }
}