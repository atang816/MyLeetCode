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

/*
1. Take each listnode froms lists and compare which is smaller
2. append smaller to new linkedlist, then append larger to the smaller appended node

3. firstListHead = list1.head, seconndListHead = list2.head
4. ListNode resultList, ListNode resultNext;
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return null;
        
        if(list1 == null)
            if(list2.val == 0)
                return new ListNode(0);
        if(list2 == null)
            if(list1.val == 0)
                return new ListNode(0);
        
        
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        
        while(list1 != null && list2 != null){
           

            if(list1.val < list2.val){
                dummyHead.next = list1;
                list1 = list1.next;
            }
            else if(list2.val < list1.val){
                dummyHead.next = list2;
                list2 = list2.next;
            }
            else{
                dummyHead.next = list1;
                list1 = list1.next;
                dummyHead = dummyHead.next;
                dummyHead.next = list2;
                list2 = list2.next;
            }
            
            dummyHead = dummyHead.next;
        }
        
        while(list2 != null){
            dummyHead.next = list2;
            dummyHead = dummyHead.next;
            list2 = list2.next;
        }
        while(list1 != null){
            dummyHead.next = list1;
            dummyHead = dummyHead.next;
            list1 = list1.next;
        }
        head = head.next;
        return head;
    }
}
