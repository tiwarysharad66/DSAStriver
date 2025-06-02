package Recursion_op;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int n  = s.nextInt();
  printname(1,n);
    }
    static void printname(int i ,int n) {
if(i>n){
  return;
}
      System.out.println("sharad");
      printname( i+1,n);
    }
}
