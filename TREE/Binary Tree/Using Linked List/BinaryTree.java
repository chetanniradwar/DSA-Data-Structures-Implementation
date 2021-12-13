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
        System.out.print(node.value+" -> ");
        inorderTraversal(node.left);
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
        preorderTraversal(node.left);
        System.out.print(node.value+" -> ");
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
}
