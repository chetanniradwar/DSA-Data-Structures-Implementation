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

    public void display()
    {         Node node =head;
            while(node!=null)
            {
                System.out.print(node.data+" <-> ");
                node= node.next;
            }
            System.out.println();
    }


}

