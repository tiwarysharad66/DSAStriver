package node;

import adt.Stack;
import stack.StackNode;

public class IntegerStackNodeList implements Stack {
    StackNode top;
    int size;

    @Override
    public void push(int data) {
         StackNode node = new StackNode(data);
         node.next = this.top;
         this.top = node;
         size++;
    }

    @Override
    public int pop() {
        if(isUnderflow()){
            System.out.print("StackOverFlow");
        }
        StackNode nodepop = this.top;
        this.top = this.top.next;
        size--;
        return nodepop.data;
    }

    @Override
    public int peek() {
if(isUnderflow()){
    return Integer.MIN_VALUE;
}
return this.top.data;

    }

    @Override
    public boolean isUnderflow() {
        if(this.top ==null){
            return true;
        }
        return size==0;
    }

    @Override
    public int getSize() {
        int count = 0;
        StackNode temp = this.top;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
//        return size;
    }

    @Override
    public char[] display() {
        StackNode temp = this.top;
        char[] array = new char[size];
        int  i=0;
        while(temp!=null){
            array[i] = (char) temp.data;
            temp = temp.next;
            i++;
        }
        return array;

    }


}
