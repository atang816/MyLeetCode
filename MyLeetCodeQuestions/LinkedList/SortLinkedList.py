# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

""" Requirements:
 1. Sort linkedlist
 
 Pseudo-Code:
 1. Create a new list and append values from list to hashSet
 2. Iterate through list and append to new list
 3. sort list
 4. Use a new linked list and point the head to the new linked List"""
class Solution(object):
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        list = []
        
        while head != None:
            list.append(head.val)
            head = head.next
        
        list.sort()
        
        dummy_head = ListNode(0)
        new_head = dummy_head
        
        for val in list:
            new_node = ListNode(val)
            dummy_head.next = new_node
            dummy_head = dummy_head.next
            
        new_head = new_head.next
            
        return new_head
        