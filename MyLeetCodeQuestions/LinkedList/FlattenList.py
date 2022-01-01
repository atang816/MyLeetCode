#User function Template for python3


'''

class Node:
    def __init__(self, d):
        self.data=d
        self.next=None
        self.bottom=None
        
        /*
	1. Create a link list that has the elements sorted in order
	2. Have to get elements by from sub linked lists
	
	Idea:
	1. Create list to get all of the elements
	2. Get each elements from list, in ascending order
	3. Append the retrieved elements to a new linked list
'''

def flatten(root):
    #Your code here
    set = []
    
    temp = root
    key = 0;
    
    while root != None:
        set.append(temp.data)
        temp = temp.bottom
        if temp == None:
            root = root.next
            temp = root
    
    set.sort()
    
    dummy_Head = Node(0)
    head = dummy_Head
    for val in set:
        append_Node = Node(val)
        dummy_Head.bottom = append_Node
        dummy_Head = dummy_Head.bottom
    
    
    return head.bottom
