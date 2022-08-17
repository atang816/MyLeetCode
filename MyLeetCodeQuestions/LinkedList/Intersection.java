/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        
        HashSet<ListNode> firstList = new HashSet<ListNode>();
        while(headA != null){
            firstList.add(headA);
            headA = headA.next;
        }
        
        while(headB != null){
            if(firstList.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        
        return null;
    }
}
