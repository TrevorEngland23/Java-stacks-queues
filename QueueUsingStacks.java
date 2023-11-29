public class QueueUsingStacks {
    //data
    MyStack st1 = new MyStack();
    MyStack st2 = new MyStack();

    //methods
    public void enqueue(int someValue){
        st1.Push(someValue); //O(1)
    }
    public int dequeue() throws Exception{ //O(n)
    
        while(!st1.IsEmpty()){
            st2.Push(st1.Pop());
        }
        int tmp = st2.Pop();
        
        while(!st2.IsEmpty()){
            st1.Push(st2.Pop());
        }
        return tmp;
    }
    public int peek() throws Exception{//O(n)
    
        while(!st1.IsEmpty()){
            st2.Push(st1.Pop());
        }
        int tmp = st2.Peek();
        
        while(!st2.IsEmpty()){
            st1.Push(st2.Pop());
        }
        return tmp;
    }
}
