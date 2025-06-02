package Recursion_op;

public class Basics2 {
    public static void main(String[] args) {
        print();
    }
    static int count = 0;
    static void print(){
        if(count==3){
            return;
        }
        System.out.println(count++);
        print();
    }

}
