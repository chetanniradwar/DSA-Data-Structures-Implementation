import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {

    Node root;

    public BinaryTree(String value) {
        root = new Node(value);
    }

public Node createBinaryTree() {

        Node N2 = new Node("N2");
        Node N3 = new Node("N3");
        Node N4 = new Node("N4");

        // Node N5 = new Node("N5");
        // Node N6 = new Node("N6");
        // Node N7 = new Node("N7");

        root.left = N2;
        root.right = N3;
        N2.left = N4;
        // N2.right = N5;
        // N3.left = N6;
        // N3.right = N7;
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

// public void deleteNode(Node node ,String value)
// {
//     boolean isPresent = search(node , value);
//     if(isPresent)
//     {
//         System.out.println("The Node does not exist") ;
//     }
//     else{
//         findDeepestNode(root);
//     }
// }
// public Node findDeepestNode(Node node)
// {
//         Queue <Node> q = new LinkedList<Node> () ;
//         if(root == null)
//         System.out.println("Tree does not have any elements");
//         else
//         q.add(root);
        
//         while(!q.isEmpty())
//         {
//             Node tmp = q.remove();
//          //    System.out.print(tmp.value +" -> ");
//             if(tmp.left==null)
//             {
//                 tmp.left = newnode ;
//                 return;.
//             }
//             else
//             q.add(tmp.left);
//             if(tmp.right==null)
//             {
//                 tmp.right = newnode;
//                 return ;
//             }
//             else
//             q.add(tmp.right);
//         }
// }
// }



Node deepestNodeParent ;
boolean isleft ;
Node deepestNode ;
public void inorder(Node node)
    {   
        if(node == null)
    return ;
        if(node.left == deepestNode)
        {
        isleft= true;
        deepestNodeParent =node ;
        }
        else if(node.right  == deepestNode)
        {
        isleft = false;
        deepestNodeParent =node ;
        }
        // System.out.print("y");
        inorder(node.left);
        inorder(node.right);
    }
    
public Node deletionBT(Node root, String key){
        //Write your code here and return the root of the changed tree
Queue <Node> q = new LinkedList<Node> ();
Node targetParent =null ;
if(root.value.equals(key))
{
    root.left=null;
    root.right =null ;
    this.root =null;
    return this.root ;
}
if(root!=null)
{
q.add(root);
}
else 
return null;

while(!q.isEmpty())
{
    
    Node node =q.remove();
    // System.out.print(node.value + "->");
    if(node.left!=null)
    if(node.left.value.equals(key)  )
    {
        targetParent = node ;
        node.left =null;        
    }
    if(node.right!=null)
    if( node.right.value.equals(key))
    {
        targetParent = node ;
        node.right =null;  
        
    }
    if(node!=root)
    deepestNode = node ;
    if(node.left!=null)
    q.add(node.left);
    if(node.right!=null)
    q.add(node.right);
    
}
if(targetParent.left==null)
targetParent.left=deepestNode ;
else if(targetParent.right==null)
targetParent.right = deepestNode;

inorder(root);

if(isleft)
{
    deepestNodeParent.left = null;
}
else
 deepestNodeParent.right = null;
        
        
       return root ;
    }


// delete entire tree

public void deleteTree(Node root)
{
this.root =null ;
System.out.println("The tree has been deleted");
}
}

