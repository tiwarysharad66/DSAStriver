package Recursion;

public class Ques1 {
    public static void main(String[] args) {
int n = 5;
print(n);
    }
     static void print(int n ){
      if(n==1){
          System.out.println(n);
      }
      else{
          System.out.println(n);
          print(n-1);
      }
     }
}
