public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList() ;
        l.add("B");
        l.add("C");
        // l.add("D");
        // l.add("E");
        // l.add("F");
        // l.add("G");
        // l.add("H");
        // l.insert("A", 0);
        // l.insert("X", 3);
        // l.insert("Z", 9);
        // l.insert("I", 22);
        l.display();
        System.out.println();
      // System.out.println("index = "+ l.search("B") ) ;

      // l.delete(0);
      l.display();
        System.out.println();
      l.delete("C");
      l.display();
        System.out.println();
      l.delete("B");
      l.display();
        System.out.println();

        
    }
}
