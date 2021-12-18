
public class Main {
    public static void main(String args[])
    {
       DirectChaining dc = new DirectChaining();
       dc.insert("chetan");
       dc.insert("niradwar");
       dc.insert("atnhce");
       System.out.println(dc.search("atnhce"));
       dc.display();
    }
}
