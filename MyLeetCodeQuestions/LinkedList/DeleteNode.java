public void deleteNode(ListNode node) 
    {
       node.val = node.next.val; // Change target node to next node value
       node.next = node.next.next; // Change pointer of the changed node to the value two spots ahead
	
	// This is essentially deleting the node ahead of the target node
    }