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

        if (node.left == null) {
            node.left = newNode;

        } else if (node.right == null) {
            node.right = newNode;
        } else if (data > node.data) {
            insert(node.right, data);
        } else if (data < node.data) {
            insert(node.left, data);
        }

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