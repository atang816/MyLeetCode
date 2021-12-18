class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minVals = new Stack<Integer>();
    
    
    
    public void push(int val) {
       
        if(minVals.empty() || val <= minVals.peek())
            minVals.push(val);
        
        
        this.stack.push(val);
    }
    
    public void pop() {
        
        if(stack.peek().equals(minVals.peek()))
            minVals.pop();
        
        this.stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return minVals.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */