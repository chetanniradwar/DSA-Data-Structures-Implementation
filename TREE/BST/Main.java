public class Main 
{    public static void main(String[] args) {
        Bst bst = new Bst();
        Node root =    bst.createBST(70);
        bst.insert( root, 50);
        bst.insert(root,90);
        bst.insert(root,30);
        bst.insert(root,60);
        bst.insert(root,80);
        bst.insert(root,100);
        bst.insert(root,20);
        bst.insert(root,40);
        // bst.insert(root,65);
        // bst.insert(root,70);
        // bst.insert(root,14);
        
        // System.out.println(bst.search(root,14));
        // System.out.println( bst.search(root ,5));

        bst.preOrdertraverse(root);
        System.out.println( );
        bst.postOrdertraverse(root);
        System.out.println();
        bst.inOrdertraverse(root);
        System.out.println();
        bst.levelOrder(root);

    }
}