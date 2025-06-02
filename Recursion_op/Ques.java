package Recursion_op;

public class Ques {
    public static void main(String[] args) {
        print("sharad",0);
    }
    public static void print(String name,int index){
        if(index==500){
            return;
        }
        print(name,index+1);
        System.out.println(name);

    }
}
