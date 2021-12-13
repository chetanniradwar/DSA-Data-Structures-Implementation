import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {

    Node root;

    public BinaryTree(String value) {
        root = new Node(value);
        // root.value = value;
        // root.left= null;
        // root.right = null;
    }

    public Node createBinaryTree() {

        Node N2 = new Node("N2");
        Node N3 = new Node("N3");
        Node N4 = new Node("N4");

        Node N5 = new Node("N5");
        Node N6 = new Node("N6");
        Node N7 = new Node("N7");

        root.left = N2;
        root.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        return root;
    }

    // Inorder Traversal
public void inorderTraversal(Node node)
{       

    if(node == null)
    return ;
    else{
        
        inorderTraversal(node.left);
        System.out.print(node.value+" -> ");
        inorderTraversal(node.right);
        }
        
}

    // Preorder Traversal

public void preorderTraversal(Node node)
{       

    if(node == null)
    return ;
    else
    {
        System.out.print(node.value+" -> ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}

    // Postorder Traversal
    public void postorderTraversal(Node node) {

        if (node == null)
            return;
        else 
        {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " -> ");
        }
    }

    // Level Order Traversal
public void levelorderTraversal(Node node)
{
        Queue <Node> q = new LinkedList<Node> () ;
        if(root == null)
        System.out.println("Tree does not have any elements");
        else
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node tmp = q.remove();
            System.out.print(tmp.value +" -> ");
            if(tmp.left!=null)
            q.add(tmp.left);
            if(tmp.right!=null)
            q.add(tmp.right);
        }
}

// searching an element in tree
public boolean search(Node node ,String target)
        {
            Queue <Node> q = new LinkedList<Node> () ;
        if(root == null)
        System.out.println("Tree does not have any elements");
        else
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node tmp = q.remove();
            if(tmp.value.equals(target))
            return true ;
            if(tmp.left!=null)
            q.add(tmp.left);
            if(tmp.right!=null)
            q.add(tmp.right);
        }
        return false ;
        }

// inserting an element in an string
public void insert(Node node , String value)
{
   Node newnode = new Node(value);
   
   Queue <Node> q = new LinkedList<Node> () ;
   if(root == null)
   {
       root = newnode ;
   }
   else{
   q.add(root);
   
   while(!q.isEmpty())
   {
       Node tmp = q.remove();
    //    System.out.print(tmp.value +" -> ");
       if(tmp.left==null)
       {
           tmp.left = newnode ;
           return;
       }
       else
       q.add(tmp.left);
       if(tmp.right==null)
       {
           tmp.right = newnode;
           return ;
       }
       else
       q.add(tmp.right);
   }
}

}
}
