public class Main 
{    public static void main(String[] args) {
        Bst bst = new Bst();
        Node root =    bst.createBST(5);
        bst.insert( root, 1);
        bst.insert(root,2);
        bst.insert(root,25);
        bst.insert(root,45);
        bst.insert(root,70);
        bst.insert(root,86);
        bst.insert(root,14);
        bst.insert(root,5);
        bst.insert(root,65);
        // bst.insert(root,70);
        // bst.insert(root,14);
        
        System.out.println(bst.search(root,14));
        System.out.println( bst.search(root ,5));

    }
}