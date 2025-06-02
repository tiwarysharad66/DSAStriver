import node.IntegerStackNodeList;

public class Main {
    public static void main(String[] args) {
        IntegerStackNodeList stack = new IntegerStackNodeList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.getSize();
        stack.peek();
       char str[] =  stack.display();
       for(int i=0;i<str.length;i++){
           System.out.println();
       }

    }
}
