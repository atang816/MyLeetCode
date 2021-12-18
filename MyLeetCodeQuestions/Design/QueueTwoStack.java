//Design and implement a queue using two stacks

/**
1. use two stacks
2. dequeue() = remove integer from the bottom (FIFO)
3. enqueue() = put integer at the top

Psuedo-Code
class Queue{
	Stack<Integer> stack1 = new Stack<Integer>()
    Stack<Integer> stack2 = new Stack<Integer>();

	enqueue(int val){
		1. stack1 gets the val -> stack1.push(val)
	}

	dequeue(){
		1. Pop off all elements from stack1 onto stack2
			while(!stack1.empty())
				stack2.push(stack1.peek())
				stack1.pop()
		2. Then get the element at the top of stack2
			return stack2.peek()

	}

}

**/

class QueueTwoStack{
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

	public void enqueue(int val){
		stack1.push(val);
	}

	public int dequeue(){
		
		while(!stack1.empty()){
			stack2.push(stack1.peek());
			stack1.pop();
		}
			
		return stack2.peek();

	}

}