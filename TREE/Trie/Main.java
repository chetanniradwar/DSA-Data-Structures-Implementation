public class Main {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("APP");
        t.insert("API");
        t.insert("APIS");
        t.insert("APIS");
        t.insert("APKR");

        // System.out.println(t.search("APP"));
        System.out.println(t.search("APK"));
        System.out.println(t.search("AP"));
        System.out.println(t.search("BO")); 
        System.out.println(t.search("APP"));
        System.out.println(t.search("APKR"));
        System.out.println(t.search("APIS"));
        System.out.println(t.search("A"));
        System.out.println(t.search("B"));
// t.printString(t.root);


        
    }
}
