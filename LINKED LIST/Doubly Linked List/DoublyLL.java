public class DoublyLL {
    int size;
    Node head;
    Node tail;

    public DoublyLL(){
        size =0;
        head=null;
        tail = null;
    }

    public void insert(int data,int index)
    {
            Node node = new Node(data);
            
            if(head==null )
            {
                head=node;
                tail=node;
                size++;
                return;
            }

            if(index==0)
            {
                node.next=head;
                node.prev=null;
                head=node;
            }
            else if(index==size)
            {
                tail.next=node;
                node.prev = tail;
                tail= tail.next;   
            }
            else
            {
                    Node trav=head;
                for(int i =0 ;i<index-1; i++)
                {
                    trav=trav.next;
                }
                node.next=trav.next;
                trav.next.prev=node;
                trav.next =node;
                node.prev=trav;
            } 
            size++;




    }
    public boolean isEmpty()
    {
        if(head==null&&tail==null)
        {
                System.out.println("LL is empty");
            return true;
        }
        else 
        return false;
    }
    public void display()
    {   
        if(isEmpty())
        return;
        
        Node node =head;
            while(node!=null)
            {
                System.out.print(node.data+" <-> ");
                node= node.next;
            }
            System.out.println();
    }

    public void reverse()
    {
        Node node = tail;
        while(node!=null)
        {
            System.out.print(node.data+" <-> ");
            node=node.prev;
        }

        System.out.println();
    }

    public  boolean search(int data)
    {
        Node node =head;
        while(node!=null)
        {
            if(node.data == data)
            return true;
            node = node.next;
        }
        return false;
    }
public void deleteLL()
{   
    Node node = head;
    while(node!=null)
    {
        node.prev=null;
        node=node.next;
    }
    head=null;
    tail=null;
}

public void  deleteNode(int x)
{
// Your code here	\\\

Node node= head;

if(x==0)
{
    if(size ==1)
    {
        head=null;
    }
    else
    {
        head=head.next;
        head.prev =null;
    }
}
else if(x==size-1)
{
    
    while(node.next!=null)
    {
        node=node.next;
    }
    node.prev.next=null;
    node.prev=null;
}

else
{
    for(int i =0 ;i<x;i++)
    {
        node=node.next;
    }
    
    node.prev.next=node.next;
   
    node.next.prev=node.prev;
     node.prev=null;
    
}



}



}

