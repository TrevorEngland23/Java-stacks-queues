public class MyStack {
    //field - data
    SinglyLinkedList values = new SinglyLinkedList();

    //methods - actions
    //Push
    public void Push(int someValue){
        values.AddFirst(someValue);
    }
    //Peek
    public int Peek(){
        return values.head.value;
    }
    //Pop
    public int Pop() throws Exception{
        int tmp = values.head.value;
        values.DeleteFirst();
        return tmp;
    }
    //IsEmpty
    public boolean IsEmpty(){
        return values.IsEmpty();
    }
    //Print
    public void Print(){
        values.Print();
    }

    //ctor(s) - init
}
