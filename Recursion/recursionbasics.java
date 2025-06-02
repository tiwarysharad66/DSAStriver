package Recursion;

public class recursionbasics {
    public static void main(String[] args) {
        //write a function that prints hello world
        message();
    }
    static void message(){
        System.out.println("helo world");
        message2();
    }
    static void message2(){
        System.out.println("helo world");
        message3();
    }
    static void message3(){
        System.out.println("helo world");
        message4();
    }
    static void message4(){
        System.out.println("helo world");
    }


}
