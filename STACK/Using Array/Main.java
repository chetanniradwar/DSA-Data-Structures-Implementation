public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);  
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
