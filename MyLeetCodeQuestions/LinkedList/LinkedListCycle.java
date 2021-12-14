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

/**
 *Requirements:
 1. check if tail of linked list reaches to another node in the linked list.
 
 Constraints:
 1. Do not know position of cycle
 2. nodes are not unique
 
 Pseudocode:
 ArrayList<ListNode> checkedNodes = new ArrayList<ListNode>()
 while(current != null){
    checkNodes.add(current.val)
    current = current.next
    if(chekcNodes.contains(current.val))
        isCycle = true
        break
    return isCycle
 }
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return true;

    }
}