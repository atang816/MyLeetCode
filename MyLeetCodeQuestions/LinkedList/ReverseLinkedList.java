
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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
         ListNode temp = head;
        ListNode pre = null;
        ListNode next = null;
        while(temp != null){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
        return head;
    }
}

/**
 * Use previous and next variable pointers to keep track of next and previous nodes in original linked list
* After looping, move head to previous variable because that’s where last node is.
 */