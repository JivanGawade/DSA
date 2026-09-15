class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long value = (long)val;
        if(st.size()==0) min = value;

        if(value >= min) st.push(value);
        else{ 
            st.push(value + (value-min));
            min = value;
        }
    }
    
    public void pop() {
        if(st.peek() < min){ 
            min = min + (min - st.peek());
        }
        st.pop();
    }
    
    public int top() { 
        long peek = st.peek();
        if(peek < min){ 
            return (int)min;
        }
        else return (int)peek;
    }
    
    public int getMin() {
        return (int)min;
    }
}