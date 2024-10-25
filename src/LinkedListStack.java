class Node{
    public int data;  // data inside the object
    Node next; // pointer will point to the next object in our list
    Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    public LinkedListStack(){
        this.top = null;
    }

    public boolean isEmpty(){
        return(top == null);
    }

    public void push(int value){
        if(isEmpty())
        {
            Node temp = new Node(value);
            top = temp;
            // top = new Nde(value); (Same meaning)
        }
        else
        {
         Node temp = new Node(value);
         temp.next = top;
         top = temp;
        }
    }

    public boolean pop(){
        if(!isEmpty())
        {
            top = top.next;
            return true;
        }
        else
        {
            System.out.println("Sorry: There are no elements to delete in the Stack ");
        }
        return false;
    }

    public int peak(){
        if(!isEmpty())
        {
            return top.data;
        }
        else
        {
            System.out.println("Sorry: There are no elements to print ");
            return 0;
        }

    }

}
