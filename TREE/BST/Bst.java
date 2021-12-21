
public class Bst
{  
    Node root;
        public Bst()
        {
            root=null;
        }
        public Node createBST(int data)
        {
            root = new Node(data);
            return root;
        }
   public void insert(Node node ,int data)
   {   
       Node newNode = new Node(data);
    
       if(node.left == null)
       {    
           node.left = newNode;
           
       }
       else if(node.right == null)
       {
           node.right = newNode;
       }
       else if(data > node.data)
       {
           insert (node.right , data);
       }
       else if(data < node.data)
       {
           insert(node.left , data);
       }

   }    
   
//    public void traverse()
//    {

//    }
//    public void delete()
//    {

//    }
   public boolean search(Node node ,int target)
   {
       while(node!=null)
       {
          if(node.data == target )
          return true;
          else if(target < node.data)
            {
                node = node.left;
            }
            else if(target>node.data)
            {
                node = node.right ;
            }
       }
       return false;
       
       
   }
}