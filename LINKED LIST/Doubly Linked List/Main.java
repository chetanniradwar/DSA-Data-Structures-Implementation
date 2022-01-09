public class Main {
    public static void main(String[] args) {
        DoublyLL l = new DoublyLL();
        l.insert(1,0);
        l.insert(2,1);
        l.insert(3,2);
        l.insert(4,3);
        l.insert(5,4);
        l.insert(6,5);
        l.display();
        l.insert(0,0);
        l.display();
        l.insert(7,7);
        l.display();
        l.insert(6,6);
        l.display();
        l.insert(555,1);
        l.display();

    }
}
