class MyStack {
    Queue<Integer> q=new LinkedList();
    public MyStack() {
        
    }
    
    public void push(int x) {
       q.add(x);
       int n= q.size();
       for(int i=1;i<=n-1;i++){
        q.add(q.remove());
       }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}
