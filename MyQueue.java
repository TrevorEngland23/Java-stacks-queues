public class MyQueue {
    //data
    SinglyLinkedList values = new SinglyLinkedList();

    //methods
    public void enqueue(int someValue){
        values.AddLast(someValue);
    }

    public int dequeue() throws Exception{
        int tmp = values.head.value;
        values.DeleteFirst();
        return tmp;
    }

    public int Peek(){
        return values.head.value;
    }

    public boolean isEmpty(){
        return values.IsEmpty();
    }

    public void Print(){
        values.Print();
    }
    //ctor(s)
}
