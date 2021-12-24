public class Main {
    public static void main(String[] args) {
        Tree t = new Tree(9);

        // t.CreateTree();
        t.insert("N1");
        t.insert("N2");
        t.insert("N3");
        t.insert("N4");
        t.insert("N5");
        t.insert("N6");
        t.insert("N7");
        t.insert("N8");
        t.insert("N9");


        // t.preOrder(1);
        // System.out.println();
        // t.postOrder(1);
        // System.out.println();
        // t.inOrder(1);
        // System.out.println();
        // t.levelOrder();
        // System.out.println();


        t.search("N2");

        t.delete("N3");

        t.levelOrder();
        // t.deleteTree();

        // t.levelOrder();
    }
}
