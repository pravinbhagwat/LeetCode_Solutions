class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> prefix;
    
    public MinStack() {
         st = new Stack<>();
         prefix = new Stack<>();
    }
    
    public void push(int val) {
        if(!st.isEmpty()) {
           st.push(val);
           prefix.push(Math.min(val, prefix.peek()));
        }
        else{
            st.push(val);
            prefix.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        prefix.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return prefix.peek();
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