
public class Main {
    
public static void main(String args[])
{
BinaryTree bt = new BinaryTree("N1") ;
// Creating binary tree
Node root = bt.createBinaryTree();
// // inorder Traversal
// bt.inorderTraversal(root);
// System.out.println();
// // preorder Traversal
// bt.preorderTraversal(root);
// System.out.println();
// // postorder Traversal
// bt.postorderTraversal(root);
// System.out.println();
// // level Order Traversals
// bt.levelorderTraversal(root);
// System.out.println();
// // search an element in an tree
// System.out.println(bt.search(root , "N8") );
bt.inorderTraversal(root);
System.out.println();
bt.insert(root, "N8");
bt.insert(root, "N9");
bt.insert(root, "N10");
bt.levelorderTraversal(root);

}






}


