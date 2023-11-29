public class SinglyLinkedList {
    //data -fields
    Node head;
    Node tail;

    //actions - methods
    //AddFirst
    public void AddFirst(int someValue){//O(1)
    
        //create a new node
        Node newNode = new Node(someValue);

        if(IsEmpty()){
            head = tail = newNode;
        }
        else {
            //link this node to the head (the beginning of the existing list)
            newNode.next = head;
    
            //move the head to point to new node
            head = newNode;
        }
    }
    //Print - traversal
    public void Print(){//O(n)
    
        if(IsEmpty()){
            System.out.println("empty list ...");
        }
        else {
            //put the finger on the head
            Node finger = head;
    
            //repeat as long as finger does not point to null
            while(finger != null){
                //display the value
                System.out.print(finger.value+" -> ");
    
                //move to the next node
                finger = finger.next;
            }
            System.out.println();   
            System.out.println();
        }
    }
    //AddLast
    public void AddLast(int someValue){//O(1)
    
        if(IsEmpty()){
            AddFirst(someValue);
        }
        else {
            //create a new node
            Node newNode = new Node(someValue);

            //link in the new node - make last node point to newnode
            tail.next = newNode;

            //move the tail
            tail = newNode;
        }
    }
    //IsEmpty
    public boolean IsEmpty(){//O(1)
    
        // if(head == null)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return head == null;
    }
    //deletes ....
    public void DeleteFirst() throws Exception{  //O(1)
    
        if(IsEmpty()){
            throw new Exception("you cannot delete from an empty list");
        }
        else if(head.next==null){//only have one node
        
            head = tail = null;
        }
        else{ //we have at least two nodes
        
            //move the head
            head = head.next;
        }
    }

    public void DeleteLast() throws Exception{ //O(n)
    
        if(IsEmpty()){
            throw new Exception("you cannot delete from an empty list");
        }
        else if(head.next ==null){ //we only have one node in the list 
        
            DeleteFirst();
        }
        else {
            //find the next to last node
            Node finger = head;
    
            while(finger.next.next!=null){
                finger = finger.next;
            }    
    
            //break the link between the last and next to last node
            finger.next = null;

            //move the tail
            tail = finger;
        }
    }

    public void clear(){ //O(1)
    
        head = tail = null;
    }
    //init
}
