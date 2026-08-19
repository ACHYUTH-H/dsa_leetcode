import java.util.LinkedList;
import java.util.Stack;
class MyQueue {
    private Stack<Integer>stack;

    public MyQueue() {
        stack=new Stack<>();
    }
    
    public void push(int x) 
    {
     if(stack.size()==0)
     {
        stack.add(x);
        return;
     }   
     
        int temp=stack.pop();
        push(x);
        stack.add(temp);
    }
    
    public int pop() 
    {
        if(stack.size()==0)
        {
            return -1;
        }
        return stack.pop();    
    }
    
    public int peek() 
    {
    return stack.peek();    
    }
    
    public boolean empty() 
    {
    return stack.isEmpty();    
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