import java.util.LinkedList;
import java.util.Queue;

public class AVL  {
    Node root;

    public AVL() {
        this.root = null;
    }

    
public int getHeight(Node node)
    {
        if(node==null)
        return 0;

        return node.height;
    }
public int getBF(Node node)
{
      return getHeight(node.left) - getHeight(node.right) ;      
}
public Node leftRotation(Node node)
{       
     Node rut=node.left;
     node.left= node.left.right;
     rut.right=node;
        // / update height
     node.height=1+ Math.max(getHeight(node.left),getHeight(node.right));
     rut.height =1+ Math.max(getHeight(rut.left),getHeight(rut.right));
        return rut;
}
public Node rightRotation(Node node)
{
    Node rut=node.right;
    node.right = node.right.left;
    rut.left=node;
    node.height=1+ Math.max(getHeight(node.left),getHeight(node.right));
    rut.height =1+ Math.max(getHeight(rut.left),getHeight(rut.right));
    return rut;
}
public void insert(int data)
    {   
         Node newNode = new Node(data);
        root = insertAVL(root,newNode);
    }

 public Node insertAVL(Node node, Node newNode) {
       
        // if root is null;
        if(node==null)
            {
                
                return newNode;
            }
         // Base conditions
        if (node.left == null && newNode.data < node.data  ) 
        {
            node.left = newNode;


        }
        else if (node.right == null && newNode.data > node.data) 
        {
            node.right = newNode;
        } 
        else if (newNode.data > node.data) 
        {
          node.right =  insertAVL(node.right, newNode);
           
        } 
        else if (newNode.data < node.data)
        {
            node.left  = insertAVL(node.left, newNode);   
        }
        node.height = 1+ Math.max(getHeight(node.left),getHeight(node.right));
        
        
        int bf = getBF(node);
        // identify rotation
            if(bf>1)
            {
                // it is LL or LR 
                if(newNode.data<=node.left.data)
                {
                        // its LL
                        // perform LL rotation
                        return leftRotation(node);
                       

                }
                else if(newNode.data>node.left.data)
                {
                    // its LR
                        node.left= rightRotation(node.left);
                        return leftRotation(node) ;

                }
            }

            if(bf<-1)
            {
                // it is RR or RL 
                if(newNode.data>=node.right.data)
                {
                        // its RR
                        // perform LL rotation
                        return rightRotation(node);
                       

                }
                else if(newNode.data<node.right.data)
                {
                    // its RL
                        node.right= leftRotation(node.right);
                        return rightRotation(node) ;

                }
            }

                return node;
    }
    public void delete(Node node ,int target)
    {
        Node parentNode =null;
        Node targetNode ;
        while(node.data != target)
        {
            if(target<node.data)
            {   parentNode = node;
                node = node.left;
            }
            if(target>node.data)
            {
                parentNode = node;
                node = node.right;
            }
        }
        targetNode = node;
        if(targetNode.left == null && targetNode.right == null)
        {
            if(parentNode.right==targetNode)
            {
                parentNode.right = null;
            }
            else if(parentNode.left ==targetNode)
            {
                parentNode.left = null;
            }
        }
        else if(targetNode.right==null || targetNode.left == null)
        {
            Node childNode =null;
            if(targetNode.left!= null)
            childNode = targetNode.left;
            else if(targetNode.right !=null)
            {
                childNode = targetNode.right;
            }
            if(parentNode.left == targetNode)
            {
                parentNode.left = childNode;
            }
            else if(parentNode.right==targetNode)
            {
                parentNode.right = childNode;
            }

        }
        else
        {      
         Node smallestparent ;
         smallestparent = findSmallestNode(targetNode.right);
         if(smallestparent==null)
         {
            Node temp=     targetNode.right;
            targetNode.data = temp.data;
                targetNode.right= temp.right;
         }
         else
         {
            targetNode.data =smallestparent.left.data;
            smallestparent.left =null;
         }  

        }
    }
    

    private Node findSmallestNode(Node node)
    {   Node parent = null;
        while(node.left!=null)
        {
               parent = node ;
               node = node.left;
        }
        return parent;
    }

    public boolean search(Node node, int target) {
        while (node != null) {
            if (node.data == target)
                return true;
            else if (target < node.data) {
                node = node.left;
            } else if (target > node.data) {
                node = node.right;
            }
        }
        return false;

    }
public void inorder()
{
    inOrdertraverse(root);
}
    public void inOrdertraverse(Node node) {
        if (node == null)
            return;
        inOrdertraverse(node.left);
        System.out.print(node.data + " -> ");
        inOrdertraverse(node.right);
    }

    public void preOrdertraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " -> ");
        preOrdertraverse(node.left);
        preOrdertraverse(node.right);

    }

    public void postOrdertraverse(Node node) {
        if (node == null)
            return;
        postOrdertraverse(node.left);
        postOrdertraverse(node.right);
        System.out.print(node.data + " -> ");
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<Node>();
        if (root == null) {
            System.out.println("BST does not exist");
            return;
        }
        Node node = root;
        q.add(node);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            System.out.println(temp.data + " h: "+ temp.height+ " -> ");
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);

        }
    }

    public void deleteAVL(Node root) {
        this.root = null;
        System.out.println("Suceessfully Deleted");
    }

}

