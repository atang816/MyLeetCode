/**
push() --> push integers to stack one

pop() --> take all elements from either stack one or stack two and move to the empty stack --> pop off the first element

peek() --> take all elements from either stack one or stack two and move to the empty stack --> peek the first element

empty() --> if(firstStac.size() and secondStack.size() == 0) return true;
**/

class MyQueue {
    Stack<Integer> firstStack = new Stack<Integer>();
    Stack<Integer> secondStack = new Stack<Integer>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        firstStack.push(x);
    }
    
    // firstStack = [1, 2] secondStack = [3, 2, 1]
    public int pop() {
        while(!firstStack.empty()){
            secondStack.push(firstStack.pop());
        }
        
        int poppedVal = secondStack.pop();
        
        while(!secondStack.empty()){
            firstStack.push(secondStack.pop());
        }
        
        return poppedVal;
    }
    
    public int peek() {
        while(!firstStack.empty()){
            secondStack.push(firstStack.pop());
        }
        
        int peekedVal = secondStack.peek();
        
        while(!secondStack.empty()){
            firstStack.push(secondStack.pop());
        }
        
        return peekedVal;
    }
    
    public boolean empty() {
        return firstStack.empty() && secondStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */