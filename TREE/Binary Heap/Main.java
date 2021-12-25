public class Main {
    public static void main(String[] args) {
        Heap h = new Heap(9,"min");

        // h.Creahehree();
        h.insert(5);
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(40);
        h.insert(50);
        // h.insert(12); 
       
     
       

      

        h.levelOrder();
        // h.insert(1);
        h.extract();
        h.levelOrder();
        




    }
}
