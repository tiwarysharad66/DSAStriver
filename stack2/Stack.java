package stack2;
    public  class Stack {
        private int[] arr;
        private int top = -1;

        public Stack() {
            this.arr = new int[5];

        }

        public Stack(int size) {
            this.arr = new int[size];
        }
        public boolean isEmpty() {
return top==-1;
        }
public boolean isFull(){
        return top==arr.length-1;
}
public void push(int n) throws Exception {
            if(isFull()){
                throw new Exception("Stack is full");
            }
            top++;
            arr[top] = n;
}
public int pop() throws Exception {
            if(isEmpty()){
               throw new Exception("Stack is Empty");
            }
            int val = arr[top ];
            arr[top]= 0;
            top--;
            return val;
}
public int peek() throws Exception {
            if(isEmpty()){
                throw new Exception("stack empty");
            }
            return arr[top];
}
public int size(){
            return top+1;
}
public void display(){
            for(int i = top;i>=0;i--){
                System.out.println(arr[i]+ " ");
            }
    System.out.println();
}
public void clear(){
            top = -1;// stack empty
            int size = this.arr.length;
            this.arr = new int[size];
}
    }


