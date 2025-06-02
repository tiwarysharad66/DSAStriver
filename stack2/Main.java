package stack2;

public class Main {
    public static void main(String[] args) throws Exception {
       Stack s= new Stack(5);
       s.push(2);
       s.push(3);
       s.push(4);

       s.display();
       s.clear();
        System.out.println(s.isEmpty());
    }
}
