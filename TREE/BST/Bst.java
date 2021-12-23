import java.util.LinkedList;
import java.util.Queue;

public class Bst {
    Node root;

    public Bst() {
        this.root = null;
    }

    public Node createBST(int data) {
        this.root = new Node(data);
        return this.root;
    }

    public void insert(Node node, int data) {
        Node newNode = new Node(data);

        if (node.left == null && newNode.data < node.data  ) {
            node.left = newNode;

        } else if (node.right == null && newNode.data > node.data) {
            node.right = newNode;
        } else if (data > node.data) {
            insert(node.right, data);
        } else if (data < node.data) {
            insert(node.left, data);
        }

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

    public void levelOrder(Node node) {
        Queue<Node> q = new LinkedList<Node>();
        if (node == null) {
            System.out.println("BST does not exist");
            return;
        }
        q.add(node);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            System.out.print(temp.data + "->");
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);

        }
    }

    public void deleteBST(Node root) {
        this.root = null;
        System.out.println("Suceessfully Deleted");
    }

}