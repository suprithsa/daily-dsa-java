class MyStack {

   Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
          q.add(x);
          moveElement();
    }
    
    public int pop() {
        
        return q.remove();
    }
    
    public int top() {
       
        return q.peek();
    }
    
    public boolean empty() {
         return q.isEmpty();
    }
   private void moveElement(){
        int size = q.size();

     for(int i=1;i<size;i++){
            q.add(q.remove());
        }
   }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */