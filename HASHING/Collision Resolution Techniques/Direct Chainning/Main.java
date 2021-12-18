
public class Main {
    public static void main(String args[])
    {
       DirectChaining dc = new DirectChaining();
       dc.insert("chetan");
       dc.insert("niradwar");
       dc.insert("atnhce");
       dc.insert("apple");
       dc.insert("ball");
       dc.insert("cat");
       dc.insert("maple");
       dc.insert("box");
       dc.insert("tac");
    //    System.out.println(dc.search("atnhce"));
       dc.display();
       dc.delete("ball");
       dc.delete("tac");
       dc.delete("max");
       dc.display();

    }
}
