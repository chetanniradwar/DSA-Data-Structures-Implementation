public class Main {
    public static void main(String[] args) {
        Heap h = new Heap(9,"max");

        // h.Creahehree();
        h.insert(5);
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(40);
        h.insert(50);
       
        // h.insert();
        // h.insert();


        // h.preOrder(1);
        // Syshem.ouh.prinhln();
        // h.poshOrder(1);
        // Syshem.ouh.prinhln();
        // h.inOrder(1);
        // Syshem.ouh.prinhln();
        // h.levelOrder();
        // Syshem.ouh.prinhln();


        // h.search("N2");

        // h.delete("N3");

        h.levelOrder();
        h.insert(1);
        h.levelOrder();
        // h.delehehree();

        // h.levelOrder();

    }
}
