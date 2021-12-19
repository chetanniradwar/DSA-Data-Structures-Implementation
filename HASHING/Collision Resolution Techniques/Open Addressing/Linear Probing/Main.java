public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing();
        lp.insert("chetan");
        lp.insert("niradwar");
        lp.insert("atnhce");
        lp.insert("apple");
        lp.insert("ball");
        lp.insert("cat");
        lp.insert("maple");
         lp.insert("box");
        lp.insert("tac");


     //    System.out.println(dc.search("atnhce"));
        lp.display();

        // lp.search("chetan");
        // lp.search("atnhce");
        //  lp.search("buzz");
        // lp.search("tac");

        lp.delete("tac");
        lp.delete("chetan");
        lp.delete("atnhce");
        lp.delete("chan");
        lp.display();

    }
}
