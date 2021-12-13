
public class Main {
    
public static void main(String args[])
{
BinaryTree bt = new BinaryTree("N1") ;
// Creating binary tree
Node root = bt.createBinaryTree();
// inorder Traversal
bt.inorderTraversal(root);
System.out.println();
// preorder Traversal
bt.preorderTraversal(root);
System.out.println();
// postorder Traversal
bt.postorderTraversal(root);
System.out.println();

bt.levelorderTraversal(root);
System.out.println();
}






}


