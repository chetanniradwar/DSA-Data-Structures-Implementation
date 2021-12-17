public class LinkedList {
    Node head ;
    Node tail ;
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
  

}

public void display()
{   Node node = head ;
    if(head==null)
    {
        System.out.println("Linked List is Empty") ;
    }
    while(node.next!= null)
    {
        System.out.print(node.data +" -> ");
        node = node.next;
    }
}

}
