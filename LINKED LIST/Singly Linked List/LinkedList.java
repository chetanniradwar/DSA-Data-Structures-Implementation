public class LinkedList {
    Node head ;
    Node tail ;
    int size =0 ;
public LinkedList()
{
   
        head = null;
        tail = null;
}

public void add(String data)
{
    Node node = new Node(data);
    if(head==null)
    {
        head= node;
        tail = node;

    }
    else{
        
        tail.next = node ;
        tail = node;
    }
    size++;

}

public void display()
{   Node node = head ;
    if(head==null)
    {
        System.out.println("Linked List is Empty") ;
    }
    while(node!= null)
    {
        System.out.print(node.data +" -> ");
        node = node.next;
    }
}

}