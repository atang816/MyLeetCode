/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
 Requirements:
 1. Merge two sorted lists together
 2. -100 <= node.val <= 100
 3. LinkedList.length <= 50
 
 Pseudo-code:
 1. Two head nodes (head1 and head2)
 2. DummyHead = new ListNode(0)
 3. Traverse while(head1 != null || head2 != null)
    3a. if(head1 > head2)
            DummyHead.next = head2
            DummyHead = dummyHead.next
            head2 = head2.next
    3b. elseif(head1 < head2)
            DummyHead.next = head1
            DummyHead.next = dummyHead.next
            head1 = head1.next
    3c. else
            DummyHead.next = head1
            DummyHead = dummyHead.next
            head1 = head1.next
            DummyHead.next = head2
            DummyHead.next = dummyHead.next
            head2 = head2.next

4. append rest of nodes from remaining list, while(head1 != null) or while(head2 != null)

End. return dummyHead.next
 * }
 */
class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        
        if(l1 != null && l2 != null){
            
            while(l1 != null && l2 != null){
                if(l1.val > l2.val){
                    dummyHead.next = l2;
                    dummyHead = dummyHead.next;
                    l2 = l2.next;
                }
                else if(l1.val < l2.val){
                    dummyHead.next = l1;
                    dummyHead = dummyHead.next;
                    l1 = l1.next;
                }
                else{
                    dummyHead.next = l1;
                    dummyHead = dummyHead.next;
                    l1 = l1.next;
                    dummyHead.next = l2;
                    dummyHead = dummyHead.next;
                    l2 = l2.next;
                }
                
            }
        }

        while(l1 != null){
            dummyHead.next = l1;
            dummyHead = dummyHead.next;
            l1 = l1.next;
        }
        while(l2 != null){
            dummyHead.next = l2;
            dummyHead = dummyHead.next;
            l2 = l2.next;
        }
        head = head.next;
        return head;
        
    }
}