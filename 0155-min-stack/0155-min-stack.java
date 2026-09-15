class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st=new Stack<>();
        minSt=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.size()==0 || val<=minSt.peek())minSt.push(val);
        else minSt.push(minSt.peek());
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
