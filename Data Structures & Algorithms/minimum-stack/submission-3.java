class MinStack {
    Stack<Integer>st;
    Stack<Integer>minst;

    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || minst.peek()>=val){
            minst.push(val);
        }
       
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        int c=st.peek();
        st.pop();
        if(c==minst.peek()){
            minst.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(!minst.isEmpty()){
            return minst.peek();
        }
        return 0;
    }
}
