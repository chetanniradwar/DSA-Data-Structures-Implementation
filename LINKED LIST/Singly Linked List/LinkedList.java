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
{   
    Node node = head ;
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

public void insert(String data ,int index)
{
    Node node = new Node(data);
    if(index>size)
    {
        System.out.println("Index out of Bound");
        return;
    }
    if(index ==0)
        {
            node.next=head;
            head=node;
        }
        else if (index==size)
        {
            tail.next=node;
            tail = node;
        }
        else
        {   
            Node temp=head;
            for(int i = 1 ; i<index ; i++)
            {
                temp = temp.next;
            }
            node.next=temp.next;
            temp.next = node;

        }
        size++;
}

public int search(String data)
{  Node node =head ;
    int index=0;
    while(node!=null)

    {
       if(node.data.equals(data))
       {
           return index;

       }
       else{

        index++;
        node= node.next;
       }
    }
    return -1;
}

public void delete( int index)
{   if(index>=size)
    {
        System.out.println("Node does not exist");
    }
    if(index== 0)
    {
        head = head.next;
    }
    else if(index == size -1)
    {
        Node temp =head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    else{
        Node prev=null ;
        Node tar = head;;
        for(int i =0; i<index;i++)
        {
            prev =tar;
            tar= tar.next;
        }
        prev.next = tar.next;
    }
    size--;
    if(size==0)
    {
        tail=null;
        head=null;
    }
}
public void delete(String data)
{
    Node node = head;
    // Node prev= null;
    int index=0;
    while(node!=null&&!node.data.equals(data))
    {   
        index++;
        node = node.next;
    }
    System.out.println(index);
    if(index==size)
    System.out.println("Node does not exist");
    else
    delete(index);
}

public void deleteList()
{
    head= null;
    tail=null;
    size = 0;
}

}
