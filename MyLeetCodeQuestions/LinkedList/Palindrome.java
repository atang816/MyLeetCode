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
 1. Determine if the list is the same forwards and backwards
 2. Append list vals to set and see if forward and backwards are the same
 Pseudo-code:
 1. HashMap list
 2. Append list.values to list, while(head != null)
    2a. list.add(head.val)
    2b. head = head.next
3. for(i = 0; i < list.size();i++)
    3a. if(list[i] != list[list.size() - i])
            return false
4. return true
 */
import java.util.HashMap;
class Palindrome {
    public boolean isPalindrome(ListNode head) {
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        int key = 0;
        while(head != null){
            list.put(key, head.val);
            key++;
            head = head.next;
        }
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != list.get(list.size() - 1 - i))
                return false;
        }
        return true;
    }
}