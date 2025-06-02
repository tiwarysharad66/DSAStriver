package stack2;

import java.util.Vector;

public class Queue {
   private int []arr;
   private int front = 0;
   private int size = 0;
   public  Queue(){
       this.arr= new int[5];
   }
   public Queue(int size){
       this.arr= new int[size];
   }
   public boolean isEmpty(){
       return size==0;
   }
   public boolean isFull(){
       return size == arr.length;
   }
   public void Enque(int n ) throws Exception {
       if(isFull()){
           throw new Exception("Queue full hogya bhaii");
       }

   }

}
