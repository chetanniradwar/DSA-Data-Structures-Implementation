
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
           insert(node.right ,data);
       }
       else if(data < node.data)
       {
           insert(node.left , data);
       }

   }    
   
   public void inOrdertraverse(Node node)
   {
    if(node==null)
    return;      
    inOrdertraverse(node.left);
    System.out.print(node.data +" -> ");
    inOrdertraverse(node.right);
   }
   public void preOrdertraverse(Node node)
   {
    if(node==null)
    return;        
    System.out.print(node.data +" -> ");
    preOrdertraverse(node.left);
            preOrdertraverse(node.right);


   }
   public void postOrdertraverse(Node node)
   {
         if(node==null)
    return;      
    postOrdertraverse(node.left);
    postOrdertraverse(node.right);
    System.out.print(node.data +" -> ");
   }
   public void delete()
   {

   }
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