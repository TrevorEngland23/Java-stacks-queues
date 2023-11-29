
public class Test {

    public static void main(String[] args) throws Exception {
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // Node n3 = new Node(30);

        // n1.next = n2;
        // n2.next = n3;

        // System.out.println(n1.value);

        // System.out.println(n2.value);
        // System.out.println(n1.next.value);

        // System.out.println(n3.value);
        // System.out.println(n1.next.next.value);

        SinglyLinkedList list = new SinglyLinkedList();
        list.AddFirst(10);
        list.AddFirst(20);
        list.AddFirst(30);
        list.Print();

        list.AddLast(15);
        list.Print();
        
        list.AddLast(25);
        list.Print();
        
        list.AddLast(35);
        list.Print();

        list.DeleteFirst();
        list.Print();

        MyStack stack = new MyStack();
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);

        System.out.println(stack.Peek());//30       
        System.out.println(stack.Peek());//30

        stack.Pop();
        System.out.println(stack.Peek());//20    

        stack.Push(40);
        System.out.println(stack.Peek()); //40
        stack.Print();


        System.out.println("testing the queue ...");
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.Peek());//10
        System.out.println(q.Peek());//10

        q.dequeue();
        
        System.out.println(q.Peek());//20
        q.enqueue(40);
        
        System.out.println(q.Peek());//20
        q.dequeue();

        System.out.println(q.Peek());//30

    }
}