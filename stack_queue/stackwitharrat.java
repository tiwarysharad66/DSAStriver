package stack_queue;

public class stackwitharrat {
    public static void main(String[] args) {
    }

        static int arr[] = new int[5];
        static int top = -1;
        public static void push(int element){
            arr[top++] = element;
        }
        public static void pop(){
            top--;
        }
        public static int peek(){
            return arr[top];
        }
        public static int size(){
            return top+1;
        }
        public static boolean isempty(){
            return top==-1;

    }
}
