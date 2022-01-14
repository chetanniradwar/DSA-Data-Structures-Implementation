public class CDLL {
    int size;
    Node head;
    Node tail;

    public CDLL(){
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
                node.prev= node;
                node.next = node;
                return;
            }

            if(index==0)
            {   

                node.next= head;
                node.prev= tail;
                tail.next  = node;
                head=node;
            }
            else if(index==size)
            {
                tail.next=node;
                head.prev=node;
                node.prev = tail;
                node.next=head;
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
            do
            {
                System.out.print(node.data+" <-> ");
                node= node.next;
            }
            while(node!=tail.next);
            System.out.println();
    }

    public void reverse()
    { 
        if(isEmpty())
        return;
        Node node = tail;
        do
        {
            System.out.print(node.data+" <-> ");
            node= node.prev;
        }
        while(node!=tail);
        

        System.out.println();
    }

    public  boolean search(int data)
    {
        if(isEmpty())
        return false ;
        Node node =head;
        do
        {
            if(node.data == data)
            return true;
            node= node.next;
        }
        while(node!=head);
    
        return false;
    }
public void deleteLL()
{   
    Node node = head;
    while(head.prev!=null)
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
if(x>=size)
{

    System.out.println("Index does not exist");
    return;
}

if(x==0)
{
    if(size ==1)
    {   
       
        head.prev=null;
        head.next=null;
        tail=null;
        head=null;
        
    }
    else
    {  
        tail.next =head.next;
        head=head.next;
        head.prev = tail;
      
    }
}
else if(x==size-1)
{
    
    while(node!=tail)
    {
        node=node.next;
    }

    node.prev.next=head;
    tail=tail.prev;
    head.prev=tail;
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
size--;


}



}
