public class Main 
{    public static void main(String[] args) {
       
        AVL avl = new AVL();
       
        // avl.insert(70);
        // avl.insert(50);
        // avl.insert(90);
        // avl.insert(30);
        // avl.insert(60);
        // avl.insert(85);
        // avl.insert(100);
        // avl.insert(20);
        // avl.insert(40);
        avl.insert(850);
        avl.insert(859);
        avl.insert(912);
        avl.insert(50);
        // 850 859 912 50 218 545 815 22 903
        avl.insert(218);
        avl.insert(545);
        avl.insert(815);
        avl.insert(22);
        avl.insert(903);
        // avl.insert(90);
        // avl.insert(root,65);
        // avl.insert(root,70);
        // avl.insert(root,14);
        
        // System.out.println(avl.search(root,14));
        // System.out.println( avl.search(root ,5));

        // avl.preOrdertraverse(root);
        // System.out.println( );
        // avl.postOrdertraverse(root);
        // System.out.println();
        
        // System.out.println();
        // avl.levelOrder(root);


        // avl.deleteavl(root);
        // System.out.println(avl.search(root,70));
        // root=null;

        // System.out.println(avl.search(root,70));
        // avl.preOrdertraverse(root);


        avl.levelOrder();
        System.out.println();
        // avl.delete(root, 40);
        // avl.delete(50);
        // avl.levelOrder(root);
        
        avl.inorder();



    }
}